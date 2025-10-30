package License_Key_Formatting;

class Solution {
    public String licenseKeyFormatting(String s, int k) {
        char[] chars = s.toCharArray();
        StringBuilder str = new StringBuilder();

        for (char c : chars) {
            if (c != '-') {
                str.append(Character.toUpperCase(c));
            }
        }
        if (str.length() <= k) {
            return str.toString();
        }

        StringBuilder res = new StringBuilder();

        int mod = str.length() % k;
        if (mod != 0) {
            res.append(str, 0, mod);
            res.append('-');
        }

        for (int i = mod; i < str.length(); i++) {
            if ((i - mod + 1) % k == 0) {
                res.append(str, i - k + 1, i + 1);
                if (i != str.length() - 1) {
                    res.append('-');
                }
            }
        }
        return res.toString();
    }
}
