import java.util.Arrays;

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {

        Arrays.sort(tokens);

        int l = 0;
        int r = tokens.length - 1;

        int score = 0;
        int maxScore = 0;

        while (l <= r) {

            if (power >= tokens[l]) {
                power -= tokens[l];
                score++;
                maxScore = Math.max(maxScore, score);
                l++;
            } else if (score > 0) {
                power += tokens[r];
                score--;
                r--;
            } else {
                break;
            }
        }

        return maxScore;
    }
}