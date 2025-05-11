package NumericalAnalysis.KullanisliMetodlar;


import java.util.Scanner;

public class Polinom {
    public static double[] diziA;
    public static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("derece(n): ");
        n = scanner.nextInt();
        diziA = new double[n + 1];//n.dereceden bir polinomun n+1 tane terimi var
        for (int i = n; i >= 0; i--) {
            System.out.print(i + ". katsayı: ");
            double katsayi = scanner.nextDouble();
            diziA[i] = katsayi;
        }
        functionToString(diziA);
    }
    public static double functionUpdate(double[] diziA, double x) {//polinom olusturma
        double f = 0;
        for (int i = diziA.length - 1; i >= 0; i--) {
            f += diziA[i] * Math.pow(x, i);
        }
        return f;
    }
    public static void functionToString(double[] diziA) {//polinomu yazdırma
        for (int i = diziA.length - 1; i >= 0; i--) {
            if (diziA[i] < 0) {
                if (i == 0) {
                    System.out.print(diziA[i]);
                } else if (i == 1) {
                    System.out.print(diziA[i] + "x");
                } else {
                    System.out.print(diziA[i] + "x^" + i);
                }
            } else if (diziA[i] > 0) {
                if (i == 0) {
                    System.out.print("+" + diziA[i]);
                } else if (i == 1) {
                    System.out.print("+" + diziA[i] + "x");
                } else {
                    System.out.print("+" + diziA[i] + "x^" + i);
                }
            }
        }
    }

}
