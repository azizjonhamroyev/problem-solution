package Groups_of_Special_Equivalent_Strings;

import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int numSpecialEquivGroups(String[] words) {
        HashSet<String> set = new HashSet<>();
        for (String word : words) {

            char[] odd;
            if (word.length() % 2 == 0) {
                odd = new char[word.length() / 2];
            } else {
                odd = new char[word.length() / 2 + 1];
            }

            char[] even = new char[word.length() / 2];

            for (int i = 0, j = 0; i < word.length(); i += 2, j++) {
                odd[j] = word.charAt(i);
                if (i + 1 < word.length()) {
                    even[j] = word.charAt(i + 1);
                }
            }
            Arrays.sort(odd);
            Arrays.sort(even);
            String s = String.valueOf(odd) + String.valueOf(even);
            set.add(s);
        }
        return set.size();
    }
}
