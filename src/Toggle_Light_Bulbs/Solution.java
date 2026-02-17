package Toggle_Light_Bulbs;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        boolean[] b = new boolean[101];
        for (Integer bulb : bulbs) {
            b[bulb] = !b[bulb];
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            if (b[i]) {
                res.add(i);
            }
        }
        return res;
    }
}
