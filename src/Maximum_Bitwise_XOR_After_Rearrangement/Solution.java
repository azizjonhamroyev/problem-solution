package Maximum_Bitwise_XOR_After_Rearrangement;

class Solution {
    public String maximumXor(String s, String t) {
        int count1 = 0, count0 = 0;

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '1') {
                count1++;
            } else {
                count0++;
            }
        }

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1' && count0 > 0) {
                res.append('1');
                count0--;
            } else if (s.charAt(i) == '0' && count1 > 0) {
                res.append('1');
                count1--;
            } else {
                res.append(0);
            }
        }
        return res.toString();
    }
}
