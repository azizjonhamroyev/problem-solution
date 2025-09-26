package Smallest_Absent_Positive_Greater_Than_Average;

import java.util.HashSet;

class Solution {
    public int smallestAbsent(int[] nums) {
        int avg=0;
        int[] set=new int[101];
        for(int n:nums){
            avg+=n;
            if(n>0) set[n]=1;
        }
        avg/=nums.length;
        for(int i=1;i<=100;i++){
            if(set[i]==0 && i>avg) return i;
        }
        return 101;
    }
}
