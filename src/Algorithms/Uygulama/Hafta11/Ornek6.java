package Algorithms.Uygulama.Hafta11;

public class Ornek6 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1) || (i == n / 2) || (j == 1) || (j == n)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
