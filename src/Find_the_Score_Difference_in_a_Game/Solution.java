package Find_the_Score_Difference_in_a_Game;

class Solution {
    public int scoreDifference(int[] nums) {
        int scoreA = 0, scoreB = 0;
        boolean turnA = true;

        for (int i = 0; i < nums.length; i++) {
            if ((i + 1) % 6 == 0) {
                turnA = !turnA;
            }
            if (nums[i] % 2 == 1) {
                turnA = !turnA;
            }

            if (turnA) {
                scoreA += nums[i];
            } else {
                scoreB += nums[i];
            }
        }
        return scoreA - scoreB;
    }
}
