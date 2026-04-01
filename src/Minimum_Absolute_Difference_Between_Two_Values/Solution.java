package Minimum_Absolute_Difference_Between_Two_Values;

class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int last1 = -1, last2 = -1, min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                last1 = i;
            } else if (nums[i] == 2) {
                last2 = i;
            }
            if (last1 != -1 && last2 != -1) {
                min = Math.min(min, Math.abs(last1 - last2));
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }
}
