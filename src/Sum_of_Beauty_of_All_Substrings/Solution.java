package Sum_of_Beauty_of_All_Substrings;

import java.util.HashMap;

class Solution {
    public int beautySum(String s) {
        int n = s.length(), res = 0;
        for (int i = 0; i < n - 1; i++) {
            HashMap<Character, Integer> pr = new HashMap<>();
            pr.put(s.charAt(i), pr.getOrDefault(s.charAt(i), 0) + 1);
            for (int j = i + 1; j < n; j++) {
                pr.put(s.charAt(j), pr.getOrDefault(s.charAt(j), 0) + 1);
                int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
                for (Integer value : pr.values()) {
                    max = Math.max(max, value);
                    min = Math.min(min, value);
                }
                res += max - min;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.beautySum("aabcbaa"));
    }
}
