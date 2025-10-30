package Maximize_Sum_of_Squares_of_Digits;

class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (num * 9 < sum) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        res.append("9".repeat(sum / 9));
        if (res.length() < num) {
            res.append(sum % 9).append("0".repeat(num - res.length()));
        }
        return res.toString();
    }
}
