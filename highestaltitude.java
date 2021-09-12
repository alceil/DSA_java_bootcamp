class Solution {
    public int largestAltitude(int[] gain) {
int max = 0;
int sum = 0;
for(int i = 0 ; i < gain.length; i++){
sum+= gain[i];

if(max < sum){
      System.out.println("yo"); 
max = sum;
}
}
        System.out.println(max);      
    System.out.println(sum);        
return max;
    }
}
