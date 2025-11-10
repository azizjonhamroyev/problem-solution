package Binary_Watch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        if (turnedOn > 8) {
            return Collections.emptyList();
        }

        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            int hourBitCount = Integer.bitCount(i);
            for (int j = 0; j < 60; j++) {
                if (hourBitCount + Integer.bitCount(j) == turnedOn) {
                    res.add(i + ":" + String.format("%02d", j));
                }
            }
        }
        return res;
    }
}
