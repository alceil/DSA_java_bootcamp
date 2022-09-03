class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> set = new HashSet<>(dictionary);
        StringBuilder res = new StringBuilder();
        for(String word : sentence.split(" ")){
            StringBuilder sb = new StringBuilder();
            for(char c : word.toCharArray()){
                sb.append(c);
                if(set.contains(sb.toString())) break;
            }
            res.append(sb).append(" ");
        }
        return res.toString().trim();
    }
}