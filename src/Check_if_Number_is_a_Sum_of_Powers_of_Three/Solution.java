package Check_if_Number_is_a_Sum_of_Powers_of_Three;

import java.util.HashSet;

class Solution {
    public boolean checkPowersOfThree(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (n > 0) {
            int counter = 0, value = 1;
            while (value <= n) {
                value *= 3;
                counter++;
            }
            if (counter != 0) {
                counter--;
                value /= 3;
            }

            if (set.contains(counter)) {
                return false;
            }
            set.add(counter);
            n -= value;
        }
        return n == 0;
    }
}
