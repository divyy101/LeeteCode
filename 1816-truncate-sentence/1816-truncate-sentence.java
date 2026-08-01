class Solution {
    public String truncateSentence(String s, int k) {

        String d = "";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                count++;

                if (count == k)
                    break;
            }

            d += s.charAt(i);
        }

        return d;
    }
}