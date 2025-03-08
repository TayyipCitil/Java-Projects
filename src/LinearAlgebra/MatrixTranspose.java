package LinearAlgebra;
public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        for (int[] row : transpose(matrix)) {
            System.out.print("[");
            for (int col : row) {
                System.out.print(col + ",");
            }
            System.out.println("\b]");
        }
    }


    static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] t = new int[col][row];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                t[j][i] = matrix[i][j];
            }
        }
        return t;

    }
}
