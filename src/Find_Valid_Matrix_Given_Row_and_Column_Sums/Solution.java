package Find_Valid_Matrix_Given_Row_and_Column_Sums;

class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n = rowSum.length;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            if (rowSum[i] > colSum[i]) {
                matrix[i][0] = colSum[i];
            } else {
                matrix[0][i] = rowSum[i];
            }
        }

        return matrix;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] ints = solution.restoreMatrix(new int[]{3, 8}, new int[]{4, 7});

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[0].length; j++) {
                System.out.print(ints[i][j] + "  ");
            }
            System.out.println();
            System.out.println();
        }
    }
}