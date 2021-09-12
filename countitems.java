class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
       int count = 0;
        int indexToMatch = 0;
        if(ruleKey.equals("type")){
            indexToMatch = 0;
        }else if(ruleKey.equals("color")){
            indexToMatch = 1;
        }else if(ruleKey.equals("name")){
            indexToMatch = 2;
        }else{
            return 0;
        }
        for(int i =0;i<items.size();i++){
            List<String> lst = items.get(i);
            String matchingValue = lst.get(indexToMatch);
            if(matchingValue.equals(ruleValue)){
                count++;
            }
        }
        return count;  
    }
}
