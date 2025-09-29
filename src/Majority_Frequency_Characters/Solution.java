package Majority_Frequency_Characters;

class Solution {
    public String majorityFrequencyGroup(String s) {
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }
        int max = 0;
        int[] counts2 = new int[101];
        for (int count : counts) {
            if (count != 0){
                counts2[count]++;
            }
        }

        for (int i = 1; i < 101; i++) {
            if (counts2[i] >= counts2[max]) {
                max = i;
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (counts[i] == max) {
                res.append((char) ('a' + i));
            }
        }
        return res.toString();
    }
}