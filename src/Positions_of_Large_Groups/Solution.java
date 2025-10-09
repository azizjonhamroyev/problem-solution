package Positions_of_Large_Groups;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        char[] cs = s.toCharArray();

        ArrayList<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < cs.length; i++) {
            int k = i;
            while (k + 1 < cs.length && cs[k] == cs[k + 1]) {
                k++;
            }
            if (k - i + 1 >= 3) {
                res.add(List.of(i, k));
            }
            i = k;
        }
        return res;
    }
}
