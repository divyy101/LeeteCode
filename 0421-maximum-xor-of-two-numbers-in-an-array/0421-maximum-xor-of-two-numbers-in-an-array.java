class Solution {
    public int findMaximumXOR(int[] nums) {

        int ans = 0;
        int mask = 0;

        for (int i = 31; i >= 0; i--) {
            mask = mask | (1 << i);
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num & mask);
            }

     
            int temp = ans | (1 << i);
            for (int x: set) {
                if (set.contains(x ^ temp)) {
                    ans = temp;
                    break;
                }
            }
        }

        return ans;
    }
}