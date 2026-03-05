package Minimum_Cost_to_Split_into_Ones;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Solution {
    public int minCost(int n) {
        return n * (n - 1) / 2;
    }

    public static void main(String[] args) {
        long a = 330L;
        System.out.printf("Reality (High Precision): %.20f\n", divideLongToDouble(a, 2));
        System.out.printf("Reality (High Precision): %.20f\n", 330L / 100.0);
    }

    public static double divideLongToDouble(long value, int scale) {
        return BigDecimal.valueOf(value)
                .divide(BigDecimal.valueOf(100.0))
                .setScale(scale, RoundingMode.HALF_UP)
                .doubleValue();
    }
}
