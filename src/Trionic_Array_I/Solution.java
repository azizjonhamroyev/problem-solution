package Trionic_Array_I;

class Solution {
    public boolean isTrionic(int[] nums) {
        if (nums[1] <= nums[0]) {
            return false;
        }
        boolean increased = true;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count > 3 || nums[i] == nums[i - 1]) {
                return false;
            }

            if (increased && nums[i] <= nums[i - 1]) {
                count++;
                increased = false;
            } else if (!increased && nums[i] >= nums[i - 1]) {
                count++;
                increased = true;
            }
        }
        if (nums[nums.length - 1] <= nums[nums.length - 2]) {
            return false;
        }
        return count == 3;
    }
}
