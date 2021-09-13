class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
         // sliding window problem
        // move the left pointer as we go along the right pointer, till it satisfies the constraint of less than k
        int start=0;
        Deque<Integer> maxDiffQ = new LinkedList<>();
        maxDiffQ.add(0);
        int result=Integer.MIN_VALUE;
        for(int j=1;j<points.length;j++) {
            int xj = points[j][0];
            int yj = points[j][1];
            // move the start to the right
            // while(start<j && xj - points[start][0] > k) start++;
            while(!maxDiffQ.isEmpty() && (xj - points[maxDiffQ.peekFirst()][0] > k)) {
                maxDiffQ.pollFirst();
            }
            
            if(!maxDiffQ.isEmpty()) {
                int idx = maxDiffQ.peekFirst();
                int maxDiff = points[idx][1] - points[idx][0];
                result = Integer.max(result, maxDiff + xj + yj);
            }
            while(!maxDiffQ.isEmpty()) {
                int idx = maxDiffQ.peekLast();
                if(points[idx][1] - points[idx][0] <= yj-xj) maxDiffQ.pollLast();
                else break;
            }
            maxDiffQ.offerLast(j);
        }
        return result;
    }
}
