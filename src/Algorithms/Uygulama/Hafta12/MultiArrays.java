package Algorithms.Uygulama.Hafta12;

public class MultiArrays {
    public static void main(String[] args) {
        int[][] matris = {{1,2,3}, {4,5}, {6,7,8}};
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j]+" ");
            }
            System.out.println();
        }

    }
}
