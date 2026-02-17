package Absolute_Difference_Between_Maximum_and_Minimum_K_Elements;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int absDifference(int[] nums, int k) {
        PriorityQueue<Integer> asc = new PriorityQueue<>(k, Comparator.comparing(a -> a));
        PriorityQueue<Integer> desc = new PriorityQueue<>(k, Comparator.comparing(a -> -a));

        for (int num : nums) {
            asc.add(num);

            if (asc.size() > k) {
                asc.poll();
            }
            desc.add(num);
            if (desc.size() > k) {
                desc.poll();
            }
        }

        int a = 0, b = 0;
        for (Integer i : asc) {
            a += i;
        }

        for (Integer i : desc) {
            b += i;
        }
        return a - b;
    }
}