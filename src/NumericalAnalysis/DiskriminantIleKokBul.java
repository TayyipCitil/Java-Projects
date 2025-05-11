package NumericalAnalysis;

import java.util.Scanner;

public class DiskriminantIleKokBul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("f(x)=Ax^2+Bx+C , 2.dereceden denklemine uygun A,B ve C sayılarını gir.");
        System.out.print("A= ");
        double A = input.nextDouble();
        System.out.print("B= ");
        double B = input.nextDouble();
        System.out.print("C= ");
        double C = input.nextDouble();
        kokBul(A,B,C);
    }

    public static void kokBul(double A, double B, double C) {
        double diskriminant = B * B - 4 * A * C;
        if (diskriminant > 0) {
            double kokBir = (-B + Math.sqrt(diskriminant)) / (2 * A);
            double kokIki = (-B - Math.sqrt(diskriminant)) / (2 * A);
            System.out.println("İki gerçek kök: " + kokBir + " ve " + kokIki);
        } else if (diskriminant == 0) {
            double citfKatliKok = -B / (2 * A);
            System.out.println("Çift katlı kök: " + citfKatliKok);
        } else {
            double reelBolum = -B / (2 * A);
            double imejinerBolum = Math.sqrt(-diskriminant) / (2 * A);
            System.out.println("İmejiner kökler: " + reelBolum + "+" + imejinerBolum + "i ve " + reelBolum + "-" + imejinerBolum + "i");
        }
    }
}
