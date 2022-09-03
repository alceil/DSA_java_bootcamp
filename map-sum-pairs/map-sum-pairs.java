class MapSum {
    HashMap<String,Integer> map;
    public MapSum() {
        map = new HashMap<String,Integer>();
    }
    
    public void insert(String key, int val) {
        if(map.containsKey(key))
            map.replace(key,val);
        else
            map.put(key,val);
    }
    
    public int sum(String prefix) {
        int ans=0;
        for(Map.Entry m: map.entrySet()){
            String str = (String)m.getKey();
            if(str.startsWith(prefix))
                ans=ans+map.get(str);
        }
        return ans;
    }
}