class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 0) return new int[k];
        Map<Integer,Integer> map = new HashMap();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pQueue = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
        for(int n:map.keySet())
        {
            pQueue.add(n);
            if(pQueue.size() > k){
                pQueue.poll();
            }
        }
        int[] result = new int[k];
        int i = 0;
        while(!pQueue.isEmpty())
        {
            int num = pQueue.poll();
            result[i++] = num;
        }
        return result;
    }
}