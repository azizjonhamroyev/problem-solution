package Longest_Fibonacci_Subarray;

class Solution {
    public int longestSubarray(int[] nums) {
        int res = 2, curr = 2;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] + nums[i + 1] == nums[i + 2]) {
                curr++;
            } else {
                res = Math.max(curr, res);
                curr = 2;
            }
        }
        return Math.max(curr, res);
    }
}