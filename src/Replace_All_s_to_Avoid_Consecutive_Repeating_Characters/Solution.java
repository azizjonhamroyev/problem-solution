package Replace_All_s_to_Avoid_Consecutive_Repeating_Characters;

class Solution {
    public String modifyString(String s) {
        if (s.length() == 1 && s.charAt(0) == ' ') {
            return "a";
        }
        char[] cs = s.toCharArray();
        if (cs[0] == '?') {
            cs[0] = getChar(cs[0], cs[1]);
        }
        if (cs[cs.length - 1] == '?') {
            cs[cs.length - 1] = getChar(cs[cs.length - 1], cs[cs.length - 2]);
        }

        for (int i = 1; i < cs.length - 1; i++) {
            if (cs[i] == '?') {
                cs[i] = getChar(cs[i - 1], cs[i + 1]);
            }
        }

        return String.valueOf(cs);
    }


    public char getChar(char left, char right) {
        char res = 'a';
        while (res == left || res == right) {
            res++;
        }
        return res;
    }
}
