class Solution {
    public String capitalizeTitle(String title) {

        title = title.toLowerCase();
        char[] arr = title.toCharArray();

        // First word
        int len = 0;
        while (len < arr.length && arr[len] != ' ')
            len++;

        if (len > 2)
            arr[0] = Character.toUpperCase(arr[0]);

        // Remaining words
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == ' ') {

                int j = i + 1;
                len = 0;

                while (j + len < arr.length && arr[j + len] != ' ')
                    len++;

                if (len > 2)
                    arr[j] = Character.toUpperCase(arr[j]);
            }
        }

        return new String(arr);
    }
}