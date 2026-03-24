package Minimum_Capacity_Box;

class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int res = 0;
        while (res < capacity.length && capacity[res] < itemSize) {
            res++;
        }

        if (res == capacity.length) {
            return -1;
        }

        for (int i = res + 1; i < capacity.length; i++) {
            if (capacity[i] >= itemSize && capacity[i] < capacity[res]) {
                res = i;
            }
        }
        return res;
    }
}