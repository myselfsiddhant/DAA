public class SetMatrixZeros {
    public static void setZeroes(int[][] matrix) {
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        // Check if first row and column have zeros
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) firstRowHasZero = true;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) firstColHasZero = true;
        }

        // Use first row and column as markers
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set rows to zero
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set columns to zero
        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set first row and column if needed
        if (firstRowHasZero) {
            for (int j = 0; j < matrix[0].length; j++) matrix[0][j] = 0;
        }
        if (firstColHasZero) {
            for (int i = 0; i < matrix.length; i++) matrix[i][0] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(matrix);
        for (int[] row : matrix) {
            System.out.println(java.util.Arrays.toString(row));
        }
    }
}