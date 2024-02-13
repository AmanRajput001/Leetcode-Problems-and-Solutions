class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int row = -1;
        int col = -1;

        for (int i = 0; i < matrix[0].length; i++) {
            int max = matrix[0][i];
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] > max) {
                    max = matrix[j][i];
                }

            }

            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][i] == -1) {
                    matrix[k][i] = max;
                }
            }
        }

        return matrix;
    }
}