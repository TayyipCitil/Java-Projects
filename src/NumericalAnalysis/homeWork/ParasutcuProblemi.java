package NumericalAnalysis.homeWork;

import java.util.Scanner;

public class ParasutcuProblemi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kütle(m): ");
        double m = input.nextFloat();//kg, kütle
        System.out.print("Drenç Katsayısı(c)=");
        double c = input.nextFloat();//kg/s, drenç katsayısı (tüm dış faktörleri içeren sabit: rüzgar, basınç,...)
        final double g = 9.806650; //m/s^2, yer çekimi ivmesi (virgülden sonra 6 basamak kullandım)

        System.out.println();
        for (int t = 0; t <= 100; t += 2) {// t saniye cinsinden zaman
            System.out.println(t + ". saniyedeki hız = " + (float) v(t, g, m, c));
        }
    }

    public static double v(int t, double g, double m, double c) {// v(t): anlık hız fonksiyonu
        double anlikHiz = (m * g / c) * (1 - Math.pow(Math.E, (-c / m * t))); //analatik çözüm dt
        return anlikHiz;
    }
}
