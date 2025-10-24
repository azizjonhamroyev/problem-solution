package Minimum_Hours_of_Training_to_Win_a_Competition;

class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int en = 0, ex = initialExperience, n = energy.length, deltaEx = 0;
        for (int i = 0; i < n; i++) {
            en += energy[i];
            if (ex <= experience[i]) {
                deltaEx += experience[i] - ex + 1;
                ex = experience[i] + 1;
            }
            ex += experience[i];
        }
        return Math.max(0, en - initialEnergy + 1) + deltaEx;
    }
}
