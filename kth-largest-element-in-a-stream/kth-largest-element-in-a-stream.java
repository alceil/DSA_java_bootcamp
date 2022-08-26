class KthLargest {
    final PriorityQueue<Integer> pq;
    final int k;

    public KthLargest(int k, int[] nums) {
      this.k = k;
      pq = new PriorityQueue<>(k);
      for(Integer item : nums){
          pq.offer(item);
          if(pq.size() > k){
              pq.poll();
          }
      }  
    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size() > this.k){
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */