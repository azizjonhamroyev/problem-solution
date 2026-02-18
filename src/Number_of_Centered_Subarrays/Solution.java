package Number_of_Centered_Subarrays;

import java.util.HashSet;

class Solution {
    public int centeredSubarrays(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            int curr = 0;
            for (int j = i; j < nums.length; j++) {
                curr += nums[j];
                set.add(nums[j]);

                if (set.contains(curr))
                    res++;
            }
        }
        return res;
    }
}