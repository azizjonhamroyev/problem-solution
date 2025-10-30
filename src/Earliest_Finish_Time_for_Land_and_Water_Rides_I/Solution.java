package Earliest_Finish_Time_for_Land_and_Water_Rides_I;

class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < landStartTime.length; i++) {
            int a = landDuration[i] + landStartTime[i];

            for (int j = 0; j < waterStartTime.length; j++) {
                if (a <= waterStartTime[j]) {
                    res = Math.min(res, waterStartTime[j] + waterDuration[j]);
                } else {
                    res = Math.min(res, a + waterDuration[j]);
                }
            }
        }
        for (int i = 0; i < waterStartTime.length; i++) {
            int a = waterDuration[i] + waterStartTime[i];

            for (int j = 0; j < landStartTime.length; j++) {
                if (a <= landStartTime[j]) {
                    res = Math.min(res, landStartTime[j] + landDuration[j]);
                } else {
                    res = Math.min(res, a + landDuration[j]);
                }
            }
        }
        return res;
    }
}
