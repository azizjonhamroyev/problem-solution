package Last_Visited_Integers;

import java.util.*;

class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        LinkedList<Integer> seen = new LinkedList<>();
        Iterator<Integer> iterator = seen.iterator();
        for (int num : nums) {
            if (num == -1) {
                res.add(iterator.hasNext() ? iterator.next() : -1);
            } else {
                seen.push(num);
                iterator = seen.iterator();
            }
        }
        return res;
    }
}
