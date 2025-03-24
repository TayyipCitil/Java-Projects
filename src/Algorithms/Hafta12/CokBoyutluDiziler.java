package Algorithms.Hafta12;

public class CokBoyutluDiziler {
    public static void main(String[] args) {
        // int[][] dizi = new int [3][5];
        int[][] dizi = {{1,2}, {3,4}, {5,6,7}};

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j]+ " ");
            }
            System.out.println();
        }

        String metin = "Cumhuriyet";
        metin.charAt(3);
    }
}
