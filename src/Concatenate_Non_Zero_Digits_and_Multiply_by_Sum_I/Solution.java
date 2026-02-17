package Concatenate_Non_Zero_Digits_and_Multiply_by_Sum_I;

class Solution {

    static {
        for (int i = 0; i < 500; i++) {
            sumAndMultiply(0);
        }
    }

    public static long sumAndMultiply(int n) {


        long sum = 0, k = 0, degree = 1;

        while (n > 0) {
            int i = n % 10;
            if (n % 10 != 0) {
                k = i * degree + k;
                degree *= 10;
                sum += i;
            }
            n /= 10;
        }
        return k * sum;
    }
}