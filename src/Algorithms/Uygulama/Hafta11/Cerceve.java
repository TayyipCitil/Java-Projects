package Algorithms.Uygulama.Hafta11;

public class Cerceve {
    public static void main(String[] args) {
        /* N sayısına göre ekrana çerçeve çizin
        örnek: n=4 için
        ****
        *  *
        *  *
        ****
         */
        int n =6;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(i==0 || i==n-1 || j==0 || j==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
