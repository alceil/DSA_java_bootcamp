class Solution {
    public String convert(String s, int numRows) {
        Map<Integer,StringBuilder> map = new HashMap<Integer,StringBuilder>();
        int pos = 0;
        boolean dir = true;
        for(char c:s.toCharArray())
        {
            if(pos==numRows) dir = false;
            if(pos==1) dir = true;
            if(dir)
            {
                pos++;
            }else{
                pos--;
            }
            if(!map.containsKey(pos))
            {
                map.put(pos,new StringBuilder());
            }
            map.get(pos).append(c);
        }
        StringBuilder res = new StringBuilder();
        for(int i:map.keySet())
        {
            res.append(map.get(i));
        }
        return res.toString();
    }
}
