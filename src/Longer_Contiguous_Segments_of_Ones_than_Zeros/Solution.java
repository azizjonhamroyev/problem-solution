package Longer_Contiguous_Segments_of_Ones_than_Zeros;

class Solution {
    public boolean checkZeroOnes(String s) {
        int n = s.length(), z = 0, o = 0, curr = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;
            } else if (s.charAt(i - 1) == '0') {
                z = Math.max(z, curr);
                curr = 1;
            } else {
                o = Math.max(o, curr);
                curr = 1;
            }
        }

        if (s.charAt(n - 1) == '0') {
            z = Math.max(z, curr);
        } else {
            o = Math.max(o, curr);
        }
        return z < o;
    }
}