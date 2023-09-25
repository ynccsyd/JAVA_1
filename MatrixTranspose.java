public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix1 = {
                { 2, 3, 4 },
                { 5, 6, 4 }
        };

        int[][] matrix2 = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        System.out.println("Matrix_1:");
        printMatrix(matrix1);
        int[][] transpose1 = transposeMatrix(matrix1);
        System.out.println("Transpose Matrix 1:");
        printMatrix(transpose1);

        System.out.println("\nMatrix_2:");
        printMatrix(matrix2);
        int[][] transpose2 = transposeMatrix(matrix2);
        System.out.println("Transpose Matrix_2:");
        printMatrix(transpose2);
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int[][] transpose = new int[numCols][numRows];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    public static void printMatrix(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
