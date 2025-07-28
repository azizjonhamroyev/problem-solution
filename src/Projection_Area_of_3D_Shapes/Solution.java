package Projection_Area_of_3D_Shapes;

class Solution {
    public int projectionArea(int[][] grid) {
        int k = 0, c = 0, d = 0;
        for (int i = 0; i < grid.length; i++) {
            int temp = grid[i][0], temp1 = grid[0][i];
            for (int j = 0; j < grid.length; j++) {
                temp = Math.max(temp, grid[i][j]);
                temp1 = Math.max(temp1, grid[j][i]);
                if (grid[i][j] != 0) {
                    k++;
                }
            }
            c += temp;
            d += temp1;
        }

        return k + c + d;
    }
}