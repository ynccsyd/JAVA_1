public class CreateMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        int number = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = number++;
                System.out.println(matrix[i][j] + " ");
            }
        }
        System.out.println();
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[i].length; j++) {
        // System.out.println(matrix[i][j] + " ");
        // }
        // }
        // System.out.println();
    }
}
