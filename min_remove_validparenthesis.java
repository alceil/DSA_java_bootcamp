class Solution {
    public String minRemoveToMakeValid(String s) {
       Stack<Integer> st = new Stack(); 
       char chars[] = s.toCharArray();
       for(int i =0;i<chars.length;i++)
       {
           char ch = chars[i];
           if(ch==')')
           {
               if(st.size()>0){
                   st.pop();
               }else{
                   chars[i]='.';
               }
           }else if(ch=='('){
               st.push(i);
           }
       }
        while(st.size()>0)
        {
            chars[st.pop()]='.';
        }
        StringBuilder sb = new StringBuilder();
        for(char c:chars)
        {
            if(c!='.')
            {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
