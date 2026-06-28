class Solution {
    public int[] plusOne(int[] digits) {

        int x = digits.length;
        int i = 0;

        // Move to the last index
        while (i != x - 1) {
            i++;
        }

        // Handle carry
        while (i >= 0) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
                i--;
            }
        }

        // If all digits were 9
        int[] ans = new int[x + 1];
        ans[0] = 1;

        return ans;
    }
}