class Solution {
    public String decodeString(String s) {
                Stack<Integer> mult = new Stack<>();
        Stack<String> prev = new Stack<>();
        StringBuilder cur = new StringBuilder("");
        int num = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                num *= 10;
                num += (int)(c - '0');
            }else if(c == '['){
                prev.push(cur.toString());
                mult.push(num);
                num = 0;
                cur = new StringBuilder("");
            }else if(c == ']'){
                int times = mult.pop();
                StringBuilder temp = new StringBuilder();
                for(int j = 0; j < times; j++){
                    temp.append(cur.toString());
                }
                cur = new StringBuilder(prev.pop() + temp.toString());
            }else if(Character.isLetter(c)){
                cur.append(c);
            }
        }
        return cur.toString();
    }
}