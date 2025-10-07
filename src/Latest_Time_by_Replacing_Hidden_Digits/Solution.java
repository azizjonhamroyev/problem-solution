package Latest_Time_by_Replacing_Hidden_Digits;

class Solution {
    public String maximumTime(String time) {
        char h1 = time.charAt(0), h2 = time.charAt(1), m1 = time.charAt(3), m2 = time.charAt(4);
        if (h1 == '?') {
            h1 = h2 == '?' || h2 <= '3' ? '2' : '1';
        }
        if (h2 == '?') {
            h2 = h1 == '2' ? '3' : '9';
        }
        if (m1 == '?') {
            m1 = '5';
        }
        if (m2 == '?') {
            m2 = '9';
        }
        return String.valueOf(new char[]{h1, h2, ':', m1, m2});
    }
}

