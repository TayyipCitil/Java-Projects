package OnlineCourses.MathExample;

import java.util.Scanner;

public class UcgenCiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sayı gir: ");
        int sonBas = input.nextInt();
        //n=2
        // *
        //***

        //n=3
        //  *
        // ***
        //*****
        for (int bas = 1; bas <= sonBas; bas++) {
            //boşluk
            for (int b = sonBas - bas; b >= 0; b--) {
                System.out.print(" ");
            }
            //yıldız
            for (int y = 1; y <= bas * 2 - 1; y++) {
                System.out.print("*");
            }
            //yeni satır
            System.out.println(" ");
        }
    }
}
