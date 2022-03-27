class Solution {
    public boolean isHappy(int n) {
        int s= n;
        int f = n;
        do{
            s = findSquare(s);
            f = findSquare(findSquare(f));
            
        }while(s!=f);
        if(s==1) return true;
        return false;
    }
    private int findSquare(int num){
        int ans = 0;
        while(num>0){
            int rem = num % 10;
            ans+=rem*rem;
            num/=10;
            
        }
        return ans;
    }
}