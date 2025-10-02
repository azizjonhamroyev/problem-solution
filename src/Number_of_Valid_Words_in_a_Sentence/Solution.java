package Number_of_Valid_Words_in_a_Sentence;

class Solution {
    public int countValidWords(String sentence) {
        sentence = sentence.trim() + " ";
        char[] chars = sentence.toCharArray();
        int res = 0;
        boolean hyphen = false;

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (isH(c) && hyphen || isP(c) && i != chars.length - 1 && !isSpace(chars[i + 1]) || Character.isDigit(c) || isUp(c) || isH(c) && (i == chars.length - 1 || isSpace(chars[i + 1]) || isP(chars[i + 1]) || i == 0 || isSpace(chars[i - 1]) || isP(chars[i - 1]))) {
                do {
                    i++;
                } while (i < chars.length && !isSpace(chars[i]));

                hyphen = false;
                while (i + 1 < chars.length && isSpace(chars[i + 1])) {
                    i++;
                }
            } else if (isH(c)) {
                hyphen = true;
            } else if (isSpace(c)) {
                res++;
                hyphen = false;
                while (i + 1 < chars.length && isSpace(chars[i + 1])) {
                    i++;
                }
            }
        }
        return res;
    }

    public boolean isUp(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public boolean isP(char c) {
        return c == '!' || c == '.' || c == ',';
    }

    public boolean isH(char c) {
        return c == '-';
    }

    public boolean isSpace(char c) {
        return c == ' ';
    }
}
