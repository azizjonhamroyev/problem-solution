package Maximum_Alternating_Sum_of_Squares;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        long sum = 0;
        int n = nums.length;
        for (int i = 0; i < n / 2; i++) {
            sum += (long) nums[n - i - 1] * nums[n - i - 1] - (long) nums[i] * nums[i];
        }
        if (nums.length % 2 == 1) {
            sum += (long) nums[n / 2] * nums[n / 2];
        }
        return sum;
    }
}