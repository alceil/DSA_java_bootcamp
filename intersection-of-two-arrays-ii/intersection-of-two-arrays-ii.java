class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       Arrays.sort(nums1);
    Arrays.sort(nums2);
    List<Integer> rList = new ArrayList<>();

    for(int i=0; i< nums1.length; i++) {
        for(int j=0; j < nums2.length; j++) {
            if(nums1[i] == nums2[j]) {
                rList.add(nums1[i]);
                nums1[i] = Integer.MIN_VALUE;
                nums2[j] = Integer.MIN_VALUE;
            } else if(nums1[i] < nums2[j]) {
                break;
            }
        }
    }
    int[] res = new int[rList.size()];
    int k=0;
    for(int r : rList) {
        res[k] = r;
        k++;
    }
    return res; 
    }
}