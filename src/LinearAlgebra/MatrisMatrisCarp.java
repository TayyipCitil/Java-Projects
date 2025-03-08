package LinearAlgebra;
public class MatrisMatrisCarp {
    public static void main(String[] args) {

        int[][] matrixA = new int[3][4];
        matrixA = new int[][]{{-3, 2, 0, 1}, {0, 4, 1, -1}, {2, -2, 1, 0}};
        int[][] matrixB = new int[4][2];
        matrixB = new int[][]{{-1, 0}, {1, 2}, {3, 3}, {-1, 1}};

        if(matrixA[0].length!=matrixB.length){
            System.out.println("Bu matrisler çarpılamaz");
        }else {
            int[][] result = new int[matrixA.length][matrixB[0].length];
            for (int i = 0; i < matrixA[0].length; i++) {
                for (int row = 0; row < result.length; row++) {
                    for (int col = 0; col < result[row].length; col++) {
                        result[row][col] += matrixA[row][i] * matrixB[i][col];
                    }
                }
            }
            for (int row = 0; row < result.length; row++) {
                for (int col = 0; col < result[row].length; col++) {
                    System.out.print(result[row][col] + " ");
                }
                System.out.println();
            }
        }
    }
}
