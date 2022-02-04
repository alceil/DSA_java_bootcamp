class Solution {
    public List<Integer> partitionLabels(String S) {
        if(S==null || S.length()== 0) return null;
        List<Integer> output_arr = new ArrayList();
        int[] last_indices = new int[26];
        for(int i=0;i<S.length();i++)
        {
            last_indices[S.charAt(i)-'a'] = i;
        }
        int start = 0;
        int end = 0;
            for(int i=0;i<S.length();i++)
        {
           end  = Math.max(end,last_indices[S.charAt(i)-'a']);
                if(i==end)
                {
                    output_arr.add(end-start+1);
                    start = end+1;
                }
        }
        return output_arr;
    }
}
