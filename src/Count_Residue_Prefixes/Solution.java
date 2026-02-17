package Count_Residue_Prefixes;

import java.util.HashSet;

class Solution {
    public int residuePrefixes(String s) {
        HashSet<Character> set = new HashSet<>();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
            if ((i + 1) % 3 == set.size()) {
                res++;
            }
        }
        return res;
    }
}
