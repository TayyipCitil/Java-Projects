package LinearAlgebra;
public class ShapeWithMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 1, 1, 1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 2, 0, 2, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 3, 3, 3, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 1, 1, 1, 1, 1, 1, 1, 0}
        };
        for (int[] row : matrix) {
            for (int col : row) {
                switch (col) {
                    case 0:
                        System.out.print(" ");
                        break;
                    case 1:
                        System.out.print("|");
                        break;
                    case 2:
                        System.out.print("$");
                        break;
                    case 3:
                        System.out.print("_");
                        break;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();


        // yıldızlardan f yazdıralım 0. ve 2. satırlar ve 0.stun yıldız olcak
        String[][] f = new String[5][5];
        for (int row = 0; row < f.length; row++) {
            for (int col = 0; col < f[0].length; col++) {
                if (row == 0 || col == 0) {
                    f[row][col] = "*";
                } else if (row == 2) {
                    f[row][col] = "*";
                }else {
                    f[row][col]=" ";
                }
            }
        }
        for (String[] row : f) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
