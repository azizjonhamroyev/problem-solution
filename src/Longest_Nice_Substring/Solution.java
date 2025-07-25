package Longest_Nice_Substring;

import java.util.HashSet;

class Solution {
    public String longestNiceSubstring(String s) {
        String res = "";
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                HashSet<Character> set = new HashSet<>();
                for (int k = i; k < j + 1; k++) {
                    set.add(s.charAt(k));
                }
                boolean isNice = true;
                for (int k = i; k < j + 1; k++) {
                    if (!set.contains((char) (s.charAt(k) + 'A' - 'a')) && !set.contains((char) (s.charAt(k) - 'A' + 'a'))) {
                        isNice = false;
                        break;
                    }
                }

                if (isNice && j - i + 1 > res.length()) {
                    res = s.substring(i, j + 1);
                }

            }
        }
        return res;
    }
}