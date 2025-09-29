package Compute_Decimal_Representation;

import java.util.Stack;

class Solution {
    public int[] decimalRepresentation(int n) {
        Stack<Integer> stack = new Stack<>();
        int multiply = 1;
        while (n > 0) {
            int i = n % 10;

            if (i != 0) {
                stack.add(n % 10 * multiply);
            }
            multiply *= 10;
            n /= 10;
        }

        int[] ints = new int[stack.size()];
        int i = 0;
        while (!stack.empty()) {
            ints[i++] = stack.pop();
        }
        return ints;
    }
}
