class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> check = new   ArrayList<>();
        int max = 0;
        for(int c:candies)
        {
            if(c>max)
            {
                max=c;
            }
        }
        
        for(int c:candies)
        {
            if(c+extraCandies>=max)
            {
               check.add(true);
            }else{
                check.add(false);
            }
        }
        return check;
    }
}
