package Check_If_a_String_Can_Break_Another_String;

import java.util.Arrays;

class Solution {
        public boolean checkIfCanBreak(String s1, String s2) {
            char[] charArray = s1.toCharArray();
            char[] charArray1 = s2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray);

            int n = s1.length();
            int i = 0;
            while (i < n && charArray1[i] == charArray[i]) {
                i++;
            }

            if (charArray[i] >= charArray1[i]) {
                for (; i < n; i++) {
                    if (charArray[i] < charArray1[i]) {
                        return false;
                    }
                }
            } else {
                for (; i < n; i++) {
                    if (charArray[i] > charArray1[i]) {
                        return false;
                    }
                }
            }

            return true;
        }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.checkIfCanBreak("yopumzgd", "pamntyya"));
    }
}
