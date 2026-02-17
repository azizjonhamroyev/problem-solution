package Count_Number_of_Maximum_Bitwise_OR_Subsets;

import java.util.HashSet;

class Solution {
    public int countMaxOrSubsets(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length - 1; i++) {
            int a = nums[i];
            set.add(a);
            for (int j = i + 1; j < nums.length; j++) {
                a |= nums[j];
                set.add(a);
            }
        }
        return set.size();
    }
}