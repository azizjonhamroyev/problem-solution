package Make_Array_Elements_Equal_to_Zero;

class Solution {
    public int countValidSelections(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        int prefix = 0;
        int res = 0;

        for (int num : nums) {
            if (num == 0 && prefix == sum) {
                res += 2;
            } else if (Math.abs(prefix - sum) == 1) {
                res++;
            }
            prefix += num;
            sum -= num;
        }
        return res;
    }
}
