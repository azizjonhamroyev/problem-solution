package Vowel_Consonant_Score;

class Solution {
    public int vowelConsonantScore(String s) {
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                v++;
            } else if (isConsonant(s.charAt(i))) {
                c++;
            }
        }
        if (c == 0 || v == 0) return 0;
        return v / c;
    }

    public boolean isVowel(char c) {
        return c == 'i' || c == 'u' || c == 'e' || c == 'o' || c == 'a';
    }

    public boolean isConsonant(char c) {
        return !isVowel(c) && 'a' < c && c <= 'z';
    }
}
