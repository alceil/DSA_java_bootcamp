class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        for(char character:jewels.toCharArray()){
            set.add(character);
        }
        int count = 0;
        for(char character:stones.toCharArray()){
            if(set.contains(character)) count++;
        }
        return count;
    }
}