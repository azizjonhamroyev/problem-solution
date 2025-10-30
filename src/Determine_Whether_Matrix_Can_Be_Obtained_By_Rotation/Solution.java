package Determine_Whether_Matrix_Can_Be_Obtained_By_Rotation;

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean isE1 = true, isE2 = true, isE3 = true, isE4 = true;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) {
                    isE1 = false;
                }
                if (mat[n - j - 1][i] != target[i][j]) {
                    isE2 = false;
                }
                if (mat[j][n - i - 1] != target[i][j]) {
                    isE3 = false;
                }
                if (mat[n - i - 1][n - j - 1] != target[i][j]) {
                    isE4 = false;
                }
            }
        }
        return isE1 || isE2 || isE3 || isE4;
    }
}