package Minimum_Distance_Between_Three_Equal_Elements_I;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = map.getOrDefault(nums[i], new ArrayList<>());
            list.add(i);
            map.put(nums[i], list);
        }
        int min = Integer.MAX_VALUE;
        for (List<Integer> list : map.values()) {
            if (list.size() > 2) {
                for (int i = 1; i < list.size() - 1; i++) {
                    min = Math.min(min, 2 * (list.get(i + 1) - list.get(i - 1)));
                }
            }
        }
        if (min == Integer.MAX_VALUE) return -1;
        return min;
    }
}

// list.get(i) - list.get(i - 1) + list.get(i + 1) - list.get(i) + list.get(i + 1) - list.get(i - 1)