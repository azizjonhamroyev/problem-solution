package Compute_Alternating_Sum;


class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0, sign = 1;
        for (int num : nums) {
            sum += num * sign;
            sign *= -1;
        }
        return sum;
    }
}