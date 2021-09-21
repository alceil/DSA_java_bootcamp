class Solution {
    public int arrangeCoins(int n) {
             for(int i=1;i<=n;i++)
        {
            n=n-i;
            if(n>i) continue;
            else return i;
        }
        return 0;
    }
}
