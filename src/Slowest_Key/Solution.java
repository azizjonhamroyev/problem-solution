package Slowest_Key;

class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {

        int time = releaseTimes[0];

        int max = keysPressed.charAt(0) - 'a';

        for (int i = 1; i < releaseTimes.length; i++) {
            int a = keysPressed.charAt(i) - 'a';
            int k = releaseTimes[i] - releaseTimes[i - 1];
            if (time < k || time == k && max < a) {
                max = a;
                time = k;
            }
        }
        return (char) (max + 'a');
    }
}
