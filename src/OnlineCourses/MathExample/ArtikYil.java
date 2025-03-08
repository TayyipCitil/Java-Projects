package OnlineCourses.MathExample;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl: ");
        int yil, kalan4, kalan100, kalan400;
        yil = input.nextInt();
        kalan4 = yil % 4;
        kalan100 = yil % 100;
        kalan400 = yil % 400;
        if (kalan4 == 0) {
            if (kalan100 == 0) {
                if (kalan400 == 0) {
                    System.out.println(yil + " yılı artık yıldır.");
                } else {
                    System.out.println(yil + " yılı artık yıl değildir");
                }
            } else {
                System.out.println(yil + " yılı artık yıldır.");
            }
        } else {
            System.out.println(yil + " yılı artık yıl değildir");
        }
    }
}
