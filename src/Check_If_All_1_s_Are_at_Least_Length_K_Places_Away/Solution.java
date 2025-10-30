package Check_If_All_1_s_Are_at_Least_Length_K_Places_Away;

class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int i = 0;
        while (i < nums.length && nums[i] != 1) {
            i++;
        }

        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] == 1) {
                if (j - i <= k) return false;
                i = j;
            }
        }
        return true;
    }
}
