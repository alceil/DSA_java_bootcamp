class RandomizedSet {
    
    Set<Integer> set;
    java.util.Random rand = new java.util.Random();
    

    public RandomizedSet() {
        set = new HashSet<>();
    }
    
    public boolean insert(int val) {
        return set.add(val);
    }
    
    public boolean remove(int val) {
        boolean toReturn = set.contains(val);
        if(toReturn) set.remove(val);
        return toReturn;
    }
    
    public int getRandom() {
         List<Integer> lst=new ArrayList<>(set);
          return lst.get(rand.nextInt(lst.size()));
    }
}
