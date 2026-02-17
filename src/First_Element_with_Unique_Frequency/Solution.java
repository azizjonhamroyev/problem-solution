package First_Element_with_Unique_Frequency;

import java.util.HashMap;

class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        HashMap<Integer, Integer> count = new HashMap<>();

        for (Integer value : map.values()) {
            count.put(value, count.getOrDefault(value, 0) + 1);
        }

        for (int num : nums) {
            if (count.get(map.get(num)) ==1) {
                return num;
            }
        }

        return -1;
    }
}