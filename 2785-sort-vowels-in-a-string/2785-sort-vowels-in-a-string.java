import java.util.Arrays;

class Solution {

    public String sortVowels(String s) {

        StringBuilder str = new StringBuilder();

        // Collect all vowels
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                str.append(ch);
            }
        }

        // Sort collected vowels
        char[] arr = str.toString().toCharArray();
        Arrays.sort(arr);

        // Convert string to char array
        char[] ans = s.toCharArray();

        int l = 0, r = 0;

        while (l < s.length()) {

            char ch = s.charAt(l);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                ans[l] = arr[r];
                r++;
            }

            l++;
        }

        return new String(ans);
    }
}