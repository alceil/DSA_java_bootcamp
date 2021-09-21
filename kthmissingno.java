class Solution {
    public int findKthPositive(int[] arr, int k) {
       int i = 1;
        int count = 0;
        while(count < k){
            boolean j = exists(i, arr);
            if(j ==  true){
                i++;
            }
            else{
                count++;
                i++;
                if(count == k){
                    return i-1;
                }
            }
        }
       return -1;
    }
    public boolean exists(int target, int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end-start) / 2;
            if(arr[mid] == target){
                return true;
            }
            else if (arr[mid] > target){
                end = mid -1;
            }
            else{
                start = mid +1;
            }

        }return false;

    }
}
