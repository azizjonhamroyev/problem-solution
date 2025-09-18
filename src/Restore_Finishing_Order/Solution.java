package Restore_Finishing_Order;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] res = new int[friends.length];

        HashSet<Integer> set = new HashSet<>();
        for (int friend : friends) {
            set.add(friend);
        }

        int j = 0;
        for (int i : order) {
            if (set.contains(i)) {
                res[j++] = i;
            }
        }
        return res;
    }
}
