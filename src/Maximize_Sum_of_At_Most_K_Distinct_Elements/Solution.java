package Maximize_Sum_of_At_Most_K_Distinct_Elements;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        List<Integer> collect = set.stream().sorted(Comparator.comparing(a -> -a)).collect(Collectors.toList());

        int[] res = new int[Math.min(k, collect.size())];

        for (int i = 0; i < res.length; i++) {
            res[i] = collect.get(i);
        }
        return res;
    }
}
