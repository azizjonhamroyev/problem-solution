package Most_Visited_Sector_in_a_Circular_Track;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int[] counts = new int[n + 1];
        for (int i = 1; i < rounds.length; i++) {
            int j = rounds[i - 1];
            while (j % (n + 1) != rounds[i]) {
                counts[j % (n + 1)]++;
                j++;
            }
        }
        counts[rounds[rounds.length - 1]]++;

        int max = 0;
        for (int count : counts) {
            max = Math.max(count, max);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == max) {
                list.add(i);
            }
        }
        return list;
    }
}
