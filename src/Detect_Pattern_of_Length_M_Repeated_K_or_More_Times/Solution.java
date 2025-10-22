package Detect_Pattern_of_Length_M_Repeated_K_or_More_Times;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length - m; i++) {
            int[] ints = Arrays.copyOfRange(arr, i, i + m);
            StringBuilder stringBuilder = new StringBuilder();
            for (int anInt : ints) {
                stringBuilder.append(anInt);
            }
            String string = stringBuilder.toString();
            map.put(string, map.getOrDefault(string, 0) + 1);
        }

        for (Integer value : map.values()) {
            if (value >= k) {
                return true;
            }
        }
        return false;
    }
}
