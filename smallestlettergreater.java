class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
               int start = 0, end = letters.length - 1;
        
		// Initialize result with any value
        char result = letters[start];
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (target < letters[mid]){
                result = letters[mid];
                end = mid - 1;
            } else start = mid + 1;
        }
        return result; 
    }
}
