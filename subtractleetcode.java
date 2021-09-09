class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int pdt=1;
        while(n>0)
        {
            int rem = n%10;
            sum=sum+rem;
            pdt=pdt*rem;
            n=n/10;
        }
        int result = pdt-sum;
        return result;     
    }
}
