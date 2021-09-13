class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
      int[] finnum = new int[num.length];
        int number=0;
        int sum =0;
        for(int n:num)
      {
            number = number*10+n;
      }  
        System.out.println(number);
        sum = number + k;
        System.out.println(sum);
        int l = finnum.length-1;
        while(sum>0){
            int r=sum%10;
            finnum[l]=r;
            sum = sum/10;
            l--;
        }
        
        
        ArrayList<Integer> ans=new ArrayList<Integer>();
        for(int s:finnum)
        {
            ans.add(s);
        }
        return ans;
    }
}
