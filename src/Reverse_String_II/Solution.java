package Reverse_String_II;

class Solution {
    public String reverseStr(String s, int k) {

        char[] res = s.toCharArray();

        for (int i = 0; i < res.length; i++) {
            if (i % (2 * k) == 0) {
                int x = Math.min(i + k, res.length);

                int l = (x + i) / 2;
                for (int j = i, a = 0; j < l; j++, a++) {
                    char temp = res[j];
                    res[j] = res[x - a - 1];
                    res[x - a - 1] = temp;
                }
                i += k - 1;
            }
        }
        return String.valueOf(res);
    }
}