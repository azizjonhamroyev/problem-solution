package Check_if_Array_Is_Sorted_and_Rotated;

class Solution {
    public boolean check(int[] nums) {
        boolean isFail = false;
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                j = i + 1;
                break;
            }
        }

        if (j == 0) return true;

        for (int k = j; k < nums.length - 1; k++) {
            if (nums[k] > nums[k + 1]) {
                return false;
            }
        }

        return nums[nums.length - 1] < nums[0];
    }
}
