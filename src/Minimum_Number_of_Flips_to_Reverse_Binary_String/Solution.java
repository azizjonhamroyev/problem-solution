package Minimum_Number_of_Flips_to_Reverse_Binary_String;

class Solution {
    public int minimumFlips(int n) {
        return Integer.bitCount(n ^ Integer.valueOf(new StringBuilder(Integer.toBinaryString(n)).reverse().toString(), 2));
    }
}
