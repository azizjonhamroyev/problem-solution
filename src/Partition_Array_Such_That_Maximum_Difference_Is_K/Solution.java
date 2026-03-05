package Partition_Array_Such_That_Maximum_Difference_Is_K;

import java.util.Arrays;

class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int curr = 0, res = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - nums[curr] > k) {
                res++;
                curr = i;
            }
        }
        return res;
    }
}
