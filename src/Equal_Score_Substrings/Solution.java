package Equal_Score_Substrings;

class Solution {
    public boolean scoreBalance(String s) {
        int sum = 0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            sum += c - 'a';
        }
        int l = 0;
        for (char c : chars) {
            l += c - 'a';
            System.out.println(l);
            if (2 * l == sum) {
                return true;
            }
        }
        return false;
    }
}
