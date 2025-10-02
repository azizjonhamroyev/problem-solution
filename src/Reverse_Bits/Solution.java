package Reverse_Bits;

class Solution {
    public int reverseBits(int n) {
        String binaryString = Integer.toBinaryString(n);
        StringBuilder reverse = new StringBuilder(binaryString).reverse();
        while (reverse.length() != 32) {
            reverse.append('0');
        }
        return Integer.parseInt(reverse.toString(), 10);
    }
}
