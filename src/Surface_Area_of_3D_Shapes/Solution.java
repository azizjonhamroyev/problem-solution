package Surface_Area_of_3D_Shapes;

class Solution {
    public int surfaceArea(int[][] grid) {
        int n = grid.length;
        int res = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res += 4 * grid[i][j] + 2;
                if (i > 0) {
                    res -= Math.min(grid[i][j], grid[i - 1][j]);
                }
                if (j > 0) {
                    res -= Math.min(grid[i][j], grid[i][j - 1]);
                }
            }
        }

        return res;
    }
}
