class Solution {
    public int mySqrt(int x) {
    int l = 0;
        int r = 46341;
        
        while(l + 1 < r){
            int mid = (r + l)/2;
            if(mid*mid > x){
                r = mid;
            } else {
                l = mid;
            }
        }
        
        return l;
    }
}
