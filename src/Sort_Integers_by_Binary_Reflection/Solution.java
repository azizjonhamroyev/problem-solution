package Sort_Integers_by_Binary_Reflection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] sortByReflection(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().sorted((a, b) -> {
            Integer i = Integer.parseInt(new StringBuilder(Integer.toBinaryString(a)).reverse().toString().replaceFirst("^0+(?!$)", ""), 2);
            Integer j = Integer.parseInt(new StringBuilder(Integer.toBinaryString(b)).reverse().toString().replaceFirst("^0+(?!$)", ""), 2);

            if (!i.equals(j)) {
                return i - j;
            }

            return a - b;
        }).collect(Collectors.toList());

        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }
}
