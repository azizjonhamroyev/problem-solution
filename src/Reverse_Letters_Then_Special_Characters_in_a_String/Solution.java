package Reverse_Letters_Then_Special_Characters_in_a_String;

class Solution {
    public String reverseByType(String s) {
        int i = 0, y = s.length() - 1, z = s.length() - 1;

        StringBuilder res = new StringBuilder();

        while (i < s.length()) {
            if (iAlphabetic(s.charAt(i))) {
                while (!iAlphabetic(s.charAt(y))) y--;
                res.append(s.charAt(y--));
            } else {
                while (iAlphabetic(s.charAt(z))) z--;
                res.append(s.charAt(z--));
            }
            i++;
        }
        return res.toString();
    }

    public boolean iAlphabetic(char c) {
        return c >= 'a' && c <= 'z';
    }
}