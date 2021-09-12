class Solution {
    public boolean checkIfPangram(String sentence) {
    int count[] = new int[26];
    boolean flag = true;        //Assuming sentence is pangram
    char ch;
 
    //Loop through each character of a string
    for(int i=0; i<sentence.length(); i++){
        ch = sentence.charAt(i);  
        if(ch == ' '){
            continue;
        }
        if(ch>='A' && ch<='Z'){
            count[ch-'A']++;      
        } else if(ch>='a' && ch<='z'){
            count[ch-'a']++;      
        }
 
    }
 
    //checking if count array has any zeros
    for(int i=0; i<count.length; i++){
      if(count[i] == 0){
        flag = false;    //Not Pangram so break
        break;
      }
    }
 
    if(flag){
           return true;
    }
        else 
    {
            return false;  
    }
    
}
}
