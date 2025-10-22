package Smallest_Missing_Multiple_of_K;

import java.util.HashSet;

class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num % k == 0) {
                set.add(num);
            }
        }
        int i = 1;
        while (set.contains(k * i)) {
            i++;
        }
        return k * i;
    }
}
