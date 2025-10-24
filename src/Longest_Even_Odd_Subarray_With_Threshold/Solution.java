package Longest_Even_Odd_Subarray_With_Threshold;

class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int max = 0, i = 0, curr = 0;
        boolean mustEven = true;

        while (i < nums.length) {
            if ((nums[i] % 2 == 0 && mustEven || nums[i] % 2 == 1 && !mustEven) && nums[i] <= threshold) {
                curr++;
                mustEven = !mustEven;
            } else if (nums[i] % 2 == 0 && nums[i] <= threshold) {
                max = Math.max(max, curr);
                curr = 1;
                mustEven = false;
            } else {
                max = Math.max(max, curr);
                curr = 0;
                mustEven = true;
            }
            i++;
        }
        return Math.max(max, curr);
    }
}