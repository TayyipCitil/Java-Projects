package OnlineCourses.MathExample;

import java.util.Scanner;

public class TekSayilarToplami {
    public static void main(String[] args) {
        //negatif sayı girilene kadar tek sayıları toplayan program
        Scanner input = new Scanner(System.in);
        int toplam = 0, sayi;
        /*System.out.print("sayı gir: ");
        sayi = input.nextInt();
        while (sayi >= 0) {
            if (!(sayi % 2 == 0)) {
                toplam += sayi;
            }
            System.out.print("sayı gir: ");
            sayi = input.nextInt();
        }
        System.out.println(toplam);*/
        do {
            System.out.print("sayı gir: ");
            sayi = input.nextInt();
            if (sayi % 2 == 1) { //eğer !(sayi%2==0) kullanılsaydı negatif sayıları da dahil ederdi
                toplam += sayi;
            }
        } while (sayi >= 0);
        System.out.println(toplam);
        System.out.println(sayi%2);
    }
}

