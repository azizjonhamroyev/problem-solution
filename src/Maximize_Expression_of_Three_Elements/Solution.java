package Maximize_Expression_of_Three_Elements;

class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int num : nums) {
            if (max1 < num) {
                if (min == Integer.MAX_VALUE && max2 != Integer.MIN_VALUE) {
                    min = max2;
                }
                max2 = max1;
                max1 = num;
            } else if (max2 < num) {
                if (min == Integer.MAX_VALUE && max2 != Integer.MIN_VALUE) {
                    min = max2;
                }
                max2 = num;
            } else if (min > num) {
                min = num;
            }
        }

        return max1 + max2 - min;
    }
}
