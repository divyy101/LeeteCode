import java.util.*;

class Solution {
    public String longestNiceSubstring(String s) {

        String ans1 = "";

        for (int i = 0; i < s.length(); i++) {

            String ans = "";

            for (int j = i; j < s.length(); j++) {

                ans += s.charAt(j);

                if (nice(ans) && ans.length() > ans1.length()) {
                    ans1 = ans;
                }
            }
        }

        return ans1;
    }

    public boolean nice(String str) {

        HashSet<Character> hs = new HashSet<>();

        for (char ch : str.toCharArray()) {
            hs.add(ch);
        }

        for (char ch : str.toCharArray()) {

            if (Character.isLowerCase(ch)) {
                if (!hs.contains(Character.toUpperCase(ch))) {
                    return false;
                }
            } else {
                if (!hs.contains(Character.toLowerCase(ch))) {
                    return false;
                }
            }
        }

        return true;
    }
}