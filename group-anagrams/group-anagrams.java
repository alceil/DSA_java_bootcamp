class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> res = new ArrayList<List<String>>(); 
       if(strs.length==0) return res;
        
        HashMap<String,ArrayList<String>> hm = new HashMap();
       
       for(String str:strs){
           int[] count = new int[26];
           for(int i=0;i<str.length();i++)
           {
               count[str.charAt(i)-'a']++;
           }
           StringBuilder sb = new StringBuilder();
           for(int c:count)
           {
               sb.append(c);
               sb.append('#');
           }
           String rep = sb.toString();
           if(hm.containsKey(rep))
           {
               ArrayList<String> ana = hm.get(rep);
               ana.add(str);
               hm.put(rep,ana);
           }else{
               ArrayList<String> ana = new ArrayList<String>();
               ana.add(str);
               hm.put(rep,ana);
           }
       } 
      
       for(List<String> val:hm.values())
       {
           res.add(val);
       }
       return res; 
    }
}