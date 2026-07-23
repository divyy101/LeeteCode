class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int x=0;
        
        for(int i=0;i<stones.length();i++){
            if(jewels.contains(""+stones.charAt(i))){
                x++;
            }
        }
        return x;

    }
}