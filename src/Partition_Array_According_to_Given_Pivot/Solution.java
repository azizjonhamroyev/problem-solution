package Partition_Array_According_to_Given_Pivot;

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int i = 0, pivotCount = 0;
        int[] res = new int[nums.length];

        for (int num : nums) {
            if (num < pivot) {
                res[i++] = num;
            } else if (num == pivot) {
                pivotCount++;
            }
        }

        while (pivotCount > 0) {
            res[i++] = pivot;
            pivotCount--;
        }

        for (int num : nums) {
            if (num > pivot) {
                res[i++] = num;
            }
        }
        return res;
    }
}