class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0, high = arr.length - 1;
	int ans = 0;

	while (low < high) {

		int mid = low + (high - low) / 2;

		if (arr[mid] > arr[mid + 1]) {
			ans = mid;
			high = mid;
		} else {
			ans = mid + 1;
			low = mid + 1;
		}
	}
	return ans;
    }
}
