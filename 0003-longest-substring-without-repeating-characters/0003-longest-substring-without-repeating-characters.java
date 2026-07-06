class Solution {
    public int lengthOfLongestSubstring(String s) {
         HashMap<Character,Integer>hm=new HashMap<>();
        int l=0,max=0;
        for(int r=0;r<s.length();r++){
            if (hm.containsKey(s.charAt(r)) && hm.get(s.charAt(r))>=l){
                l=hm.get(s.charAt(r))+1;

            }
            hm.put(s.charAt(r),r);
            
            max=Math.max(max,r-l+1);
        }
     return max;   
    }
}