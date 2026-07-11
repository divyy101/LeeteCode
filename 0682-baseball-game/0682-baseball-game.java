 class Solution {
    public int calPoints(String[] operations) {

        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i < operations.length; i++) {

            if (!operations[i].equals("+") &&
                !operations[i].equals("D") &&
                !operations[i].equals("C")) {

                st.push(Integer.parseInt(operations[i]));
            }

            else if (operations[i].equals("+")) {

                int first = st.pop();
                int second = st.peek();
                int sum = first + second;

                st.push(first);
                st.push(sum);
            }

            else if (operations[i].equals("D")) {

                st.push(2 * st.peek());
            }

            else if (operations[i].equals("C")) {

                st.pop();
            }
        }

        int ans = 0;

        while (!st.isEmpty()) {
            ans += st.pop();
        }

        return ans;
    }
}
              