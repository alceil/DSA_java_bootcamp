class Solution {
    public int maximumPopulation(int[][] logs) {
      int minYear = 1950;
    int[] years = new int[101];
    
    for(int [] log : logs){
        
        for(int i=log[0]-minYear; i<log[1]-minYear; i++){
             years[i]++;
        }
       
        
    }
    int earliestYear= 0;
    int population=0;
    
    System.out.println(Arrays.toString(years));
    
    for(int i=0; i<years.length; i++){
        
        if(years[i]> population) {
            
            population = years[i];
            earliestYear = i+1950;  
        }
    }
    
    return earliestYear;  
    }
}
