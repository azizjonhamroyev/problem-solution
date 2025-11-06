package Find_Missing_Elements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        boolean[] exists = new boolean[101];
        int min = 101, max = 0;
        for (int num : nums) {
            exists[num] = true;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if (nums.length == max - min + 1) {
            return Collections.emptyList();
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = min + 1; i < max; i++) {
            if (!exists[i]) {
                res.add(i);
            }
        }
        return res;
    }
}
