import java.util.*;

class Solution {
    public int minimumPushes(String word) {

        int[] freq = new int[26];

        // Count frequency
        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Sort frequencies
        Arrays.sort(freq);

        int pushes = 0;
        int cost = 1;

        // Traverse from highest frequency
        for (int i = 25, count = 0; i >= 0 && freq[i] > 0; i--, count++) {

            if (count == 8)
                cost = 2;
            else if (count == 16)
                cost = 3;
            else if (count == 24)
                cost = 4;

            pushes += freq[i] * cost;
        }

        return pushes;
    }
}