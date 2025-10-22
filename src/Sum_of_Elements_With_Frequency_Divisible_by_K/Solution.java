package Sum_of_Elements_With_Frequency_Divisible_by_K;

class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int[] c = new int[101];

        for (int num : nums) {
            c[num]++;
        }

        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] % k == 0) {
                sum += i * c[i];
            }
        }
        return sum;
    }
}
