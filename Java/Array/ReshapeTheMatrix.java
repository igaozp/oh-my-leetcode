public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                size++;
            }
        }

        int[] origin = new int[size];
        int[][] matrix = new int[r][c];
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (flag < size) {
                    origin[flag] = nums[i][j];
                    flag++;
                }
            }
        }

        if (origin.length < c * r) {
            return nums;
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = origin[i * c + j];
            }
        }
        return matrix;
    }
}