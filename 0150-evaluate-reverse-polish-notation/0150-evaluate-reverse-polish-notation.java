class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i < tokens.length; i++) {

            if (!tokens[i].equals("+") &&
                !tokens[i].equals("-") &&
                !tokens[i].equals("*") &&
                !tokens[i].equals("/")) {

                st.push(Integer.parseInt(tokens[i]));
            } else {

                int f = st.pop();
                int s = st.pop();

                if (tokens[i].equals("+")) {
                    st.push(s + f);
                } else if (tokens[i].equals("-")) {
                    st.push(s - f);
                } else if (tokens[i].equals("*")) {
                    st.push(s * f);
                } else {
                    st.push(s / f);
                }
            }
        }

        return st.peek();
    }
}