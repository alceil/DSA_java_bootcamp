class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
          HashSet<Integer> hs1 = new HashSet<>();
	    
	    for(int i: nums1){
	        hs1.add(i);
	    }
	    
	    HashSet<Integer> hs2 = new HashSet<>();
	    
	    for(int i: nums2){
	        hs2.add(i);
	    }
	    
	    ArrayList<Integer> al1 = new ArrayList<>(hs1);
	    
	    ArrayList<Integer> al2 = new ArrayList<>(hs2);
	    
	    HashMap<Integer, Integer> hm = new HashMap<>();
	    for(int i=0; i<al1.size(); i++){
	        hm.put(al1.get(i), 1);
	    }
	    
	    int index = 0;
	    ArrayList<Integer> ans = new ArrayList<>();
	    for(int i=0; i<al2.size(); i++){
	        if(hm.containsKey(al2.get(i))){
	            ans.add(al2.get(i));
	        }
	    }
	    
	    int[] arr = new int[ans.size()];
        int j =0;
        for(int i: ans){
            arr[j] = i;
            j++;
        }
	    
	    return arr;
    }
}
