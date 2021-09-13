class Solution {
    public int[] sumZero(int n) {
          int[] ans = new int[n];
    for(int i=0; i<n-1; i+=2) {
        System.out.println(i);
        ans[i]  = (i+1);
        ans[i+1] = -(i+1);
    }
    return ans;
    }
}
