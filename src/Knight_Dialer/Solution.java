package Knight_Dialer;

import java.util.Arrays;

class Solution {

    public long[][][] A;

    public int knightDialer(int n) {
        A = new long[n + 1][4][3];
        long res = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                res = (res + paths(i, j, n, A)) % 1_000_000_007;
            }
        }
        return (int) res;
    }

    private long paths(int i, int j, int n, long[][][] arr) {
        if (i < 0 || j < 0 || i >= 4 || j >= 3 || (i == 3 && j != 1)) return 0;
        if (n == 1) return 1;
        if (A[n - 1][i][j] > 0) return A[n - 1][i][j];
        A[n - 1][i][j] = paths(i - 1, j - 2, n - 1, A) % 1_000_000_007 +
                paths(i - 2, j - 1, n - 1, A) % 1_000_000_007 +
                paths(i - 2, j + 1, n - 1, A) % 1_000_000_007 +
                paths(i - 1, j + 2, n - 1, A) % 1_000_000_007 +
                paths(i + 1, j + 2, n - 1, A) % 1_000_000_007 +
                paths(i + 2, j + 1, n - 1, A) % 1_000_000_007 +
                paths(i + 2, j - 1, n - 1, A) % 1_000_000_007 +
                paths(i + 1, j - 2, n - 1, A) % 1_000_000_007;
        return A[n - 1][i][j];
    }
}

/*
1 -> 8, 6
2 -> 7, 9
3 -> 8, 4
4 -> 3, 9, 0
5 ->
6 -> 1, 7, 0
7 -> 6, 2
8 -> 1, 3
9 -> 2, 4
0 -> 6, 4
 */

/*
1 -> 2 ta
2 -> 2 ta
3 -> 2 ta
4 -> 3 ta
5 -> 0 ta
6 -> 3 ta
7 -> 2 ta
8 -> 2 ta
9 -> 2 ta
0 -> 2 ta
 */


