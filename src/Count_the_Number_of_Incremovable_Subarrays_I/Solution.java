package Count_the_Number_of_Incremovable_Subarrays_I;

class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int res = 0, n = nums.length;

        for (int i = 0; i < n; i++) {
            boolean isAscL = true;
            for (int k = 0; k < i - 1; k++) {
                if (nums[k] >= nums[k + 1]) {
                    isAscL = false;
                    break;
                }
            }

            if (!isAscL) continue;

            for (int j = i; j < n; j++) {
                boolean isAscR = true;

                if (i >= 1 && j < nums.length - 1 && nums[i - 1] >= nums[j + 1]) {
                    isAscR = false;
                } else {
                    for (int k = j + 1; k < nums.length - 1; k++) {
                        if (nums[k] >= nums[k + 1]) {
                            isAscR = false;
                            break;
                        }
                    }
                }
                if (isAscR) res++;
            }
        }
        return res;
    }
}
