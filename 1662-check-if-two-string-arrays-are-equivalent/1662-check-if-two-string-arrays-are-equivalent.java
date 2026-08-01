class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String k="",l="";
        for(int i=0;i<word1.length;i++){
            k=k+word1[i];

        }
        for(int i=0;i<word2.length;i++){
            l=l+word2[i];

        }
        if(l.equals(k)){
            return true;
        }
        return false;
    }
}