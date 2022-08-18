class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> deads = new HashSet<>(Arrays.asList(deadends));
        if(deads.contains(target) || deads.contains("0000"))
            return -1;
        Queue<String> q = new LinkedList<>();
        q.offer("0000");
        deads.add("0000");
        int step = 0;
        
        while(!q.isEmpty()){
            int len = q.size();
            for(int i = 0; i < len; i++){
                String curr = q.poll();
                if(curr.equals(target))
                    return step;
                List<String> neigh = neighbors(curr);
                for(String s : neigh){
                    if(!deads.contains(s)){
                        deads.add(s);
                        q.offer(s);
                    }
                }
            }
            step++;
        }
        return -1;
    }
    
    public List<String> neighbors(String s){
        List<String> ans = new ArrayList<String>();
        char[] curr = s.toCharArray();
        for(int i = 0; i < 4; i++){
            if(curr[i] == '9'){
                char p = curr[i];
                curr[i] -= 1;
                ans.add(new String(curr));
                curr[i] = '0';
                ans.add(new String(curr));
                curr[i] = p;
            }
            else if(curr[i] == '0'){
                char p = curr[i];
                curr[i] += 1;
                ans.add(new String(curr));
                curr[i] = '9';
                ans.add(new String(curr));
                curr[i] = p;
            }
            else{
                char p = curr[i];
                curr[i] += 1;
                ans.add(new String(curr));
                curr[i] -= 2;
                ans.add(new String(curr));
                curr[i] = p;
            }
        }
        return ans;
    }
}