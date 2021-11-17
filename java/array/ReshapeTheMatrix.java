
public class ReshapeTheMatrix {
    public static class Solution {
        public int[][] matrixReshape(int[][] nums, int r, int c) {
            int size = 0;
            for (int[] num : nums) {
                for (int j = 0; j < num.length; j++) {
                    size++;
                }
            }

            int[] origin = new int[size];
            int[][] matrix = new int[r][c];
            int flag = 0;
            for (int[] num : nums) {
                for (int i : num) {
                    if (flag < size) {
                        origin[flag] = i;
                        flag++;
                    }
                }
            }

            if (origin.length < c * r) {
                return nums;
            }
            for (int i = 0; i < r; i++) {
                System.arraycopy(origin, i * c, matrix[i], 0, c);
            }
            return matrix;
        }
    }
}

