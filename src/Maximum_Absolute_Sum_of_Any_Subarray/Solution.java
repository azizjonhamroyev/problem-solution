package Maximum_Absolute_Sum_of_Any_Subarray;

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int currentSum = 0, currentSum2 = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int num : nums) {
            currentSum = Math.max(num, currentSum + num);
            max = Math.max(currentSum, max);

            currentSum2 = Math.min(num, currentSum2 + num);
            min = Math.min(currentSum2, min);
        }

        return Math.max(Math.abs(max), Math.abs(min));
    }
}