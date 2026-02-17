package Minimum_Prefix_Removal_to_Make_Array_Strictly_Increasing;

class Solution {
    public int minimumPrefixLength(int[] nums) {
        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i] <= nums[i-1]) {
                return i;
            }
        }
        return 0;
    }
}
