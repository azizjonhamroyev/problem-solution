package Maximum_Total_Subarray_Value_I;

class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int num : nums) {
            if (max < num) {
                max = num;
                min = Math.min(min, max);
            } else if (min > num) {
                min = num;
            }
        }

        return (long) (max - min) * k;
    }
}
