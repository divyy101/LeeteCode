class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int l = 0;
        int r = col - 1;   

        while (l < row && r >= 0) {

            if (matrix[l][r] == target) {
                return true;
            } else if (matrix[l][r] < target) {
                l++;
            } else {
                r--;
            }
        }

        return false;
    }
}