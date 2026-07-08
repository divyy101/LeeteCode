
 class Solution {

    public static int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            int hours = 0;

            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            if (hours <= h) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] piles = new int[n];

        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }

        int h = sc.nextInt();

        System.out.println(minEatingSpeed(piles, h));
    }
}