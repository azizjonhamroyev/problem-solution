package shuffle_an_array;

import java.util.HashSet;
import java.util.Random;

class Solution {
    int[] d;

    public Solution(int[] nums) {
        d = nums;
    }

    public int[] reset() {
        return d;
    }

    public int[] shuffle() {
        Random random = new Random();
        HashSet<Integer> set = new HashSet<>();
        int[] res = new int[d.length];
        int i = 0;
        while (i < res.length) {
            int k = Math.abs(random.nextInt());
            if (!set.contains(k % d.length)) {
                int mod = k % d.length;
                res[i] = d[mod];
                set.add(mod);
                i++;
            }
        }
        return res;
    }
}
