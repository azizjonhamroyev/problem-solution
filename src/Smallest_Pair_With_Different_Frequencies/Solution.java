package Smallest_Pair_With_Different_Frequencies;

import java.util.HashMap;
import java.util.Objects;

class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int x = Integer.MAX_VALUE;
        for (Integer i : map.keySet()) {
            x = Math.min(x, i);
        }

        int y = Integer.MAX_VALUE;
        for (Integer i : map.keySet()) {
            if (i > x && !Objects.equals(map.get(x), map.get(i)) && i < y) {
                y = i;
            }
        }

        if (y == Integer.MAX_VALUE) {
            return new int[]{-1, -1};
        }
        return new int[]{x, y};
    }
}
