class Solution {
    public String longestPalindrome(String s) {
        int st=0,e=0;
        for(int i=0;i<s.length();i++)
        {
            int odd = expand(s,i,i);
            int even = expand(s,i,i+1);
            int len = Math.max(odd,even);
            if(len > e-st){
                st = i - (len-1)/2;
                e = i + len/2;
            }
        }
        return s.substring(st,e+1);
    }
    
    int expand(String s,int left,int right)
    {
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
            
        }
        return right-left-1;
    }
}
