package NumericalAnalysis.Bireysel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BairstowHesap {
    public static double[] diziA;
    public static double[][] kokler;
    public static int kokIndex = 0; //kokler dizisinde nerde kaldığımızı bilmek için

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        while (true) {
            try {
                System.out.print("derece(n): ");
                n = scanner.nextInt();
                if (n < 0) throw new InputMismatchException();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Polinomun derecesi doğal sayı olmalıdır {0,1,2,..}");
                scanner.nextLine();
            }
        }

        diziA = new double[n + 1];
        for (int i = n; i >= 0; i--) {
            while (true) {
                System.out.print(i + ". katsayı: ");
                double katsayi = scanner.nextDouble();
                if (i == n && katsayi == 0 && i != 0) {
                    System.out.println("Baş katsayı 0 olamaz.");
                } else {
                    diziA[i] = katsayi;
                    break;
                }
            }
        }

        kokler = new double[2][n];

        double r = 0.0, s = 0.0;
        int n_eps = 0, iMax = 0;

        if (n > 2) {
            System.out.print("n_eps: ");
            n_eps = scanner.nextInt();
            System.out.print("r: ");
            r = scanner.nextDouble();
            System.out.print("s: ");
            s = scanner.nextDouble();
            System.out.print("iMax: ");
            iMax = scanner.nextInt();
        }

        while (diziA.length - 1 > 2) {
            double[] b = bairstow(diziA, r, s, n_eps, iMax);
            diskriminantIleKokBul(1, -r, -s);
            diziA = dereceDusur(diziA, b);
        }
        if (diziA.length - 1 == 2) {
            diskriminantIleKokBul(diziA[2], diziA[1], diziA[0]);
        } else if (diziA.length - 1 == 1) {
            kokler[0][kokIndex++] = yuvarla(-diziA[0] / diziA[1], 2);
        }
        printRoots(kokler);
    }

    public static double[] bairstow(double[] a, double rStart, double sStart, int n_eps, int iMax) {
        int n = a.length - 1;
        double[] b = new double[n + 1];
        double[] c = new double[n + 1];
        double r = rStart, s = sStart;
        double deltaR, deltaS;
        double es = 0.5 * Math.pow(10, 2 - n_eps);

        int iter = 0;
        do {
            b[0] = a[0];
            b[1] = a[1] + r * b[0];
            for (int i = 2; i <= n; i++) {
                b[i] = a[i] + r * b[i - 1] + s * b[i - 2];
            }

            c[0] = b[0];
            c[1] = b[1] + r * c[0];
            for (int i = 2; i < n; i++) {
                c[i] = b[i] + r * c[i - 1] + s * c[i - 2];
            }

            double det = c[n - 2] * c[n - 2] - c[n - 3] * c[n - 1];
            deltaR = (b[n] * c[n - 3] - b[n - 1] * c[n - 2]) / det;
            deltaS = (b[n - 1] * c[n - 1] - b[n] * c[n - 2]) / det;

            r += deltaR;
            s += deltaS;
            iter++;
        } while ((Math.abs(deltaR) > es || Math.abs(deltaS) > es) && iter < iMax);

        return b;
    }

    public static double[] dereceDusur(double[] a, double[] b) {
        int yeniDerece = a.length - 2;
        double[] yeniA = new double[yeniDerece];
        for (int i = 0; i < yeniDerece; i++) {
            yeniA[i] = b[i];
        }
        return yeniA;
    }

    public static void diskriminantIleKokBul(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d > 0) {
            kokler[0][kokIndex] = yuvarla((-b + Math.sqrt(d)) / (2 * a), 2);
            kokler[0][kokIndex + 1] = yuvarla((-b - Math.sqrt(d)) / (2 * a), 2);
        } else if (d == 0) {
            kokler[0][kokIndex] = yuvarla(-b / (2 * a), 2);
            kokler[0][kokIndex + 1] = kokler[0][kokIndex];
        } else {
            kokler[0][kokIndex] = yuvarla(-b / (2 * a), 2);
            kokler[0][kokIndex + 1] = kokler[0][kokIndex];
            kokler[1][kokIndex] = yuvarla(Math.sqrt(-d) / (2 * a), 2);
            kokler[1][kokIndex + 1] = -kokler[1][kokIndex];
        }
        kokIndex += 2;
    }

    public static void printRoots(double[][] kokler) {
        int kokSayisi = kokler[0].length;
        System.out.println("kokler matrisi:");
        for (int row = 0; row < kokler.length; row++) {
            System.out.print("satır " + row + ": ");
            for (int col = 0; col < kokSayisi; col++) {
                System.out.print(kokler[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static double yuvarla(double sayi, int basamak) {
        double kat = Math.pow(10, basamak);
        return Math.round(sayi * kat) / kat;
    }
}

    /*public static void printRoots(double[][] kokler) {
        boolean ilkYazi=true;
        int kokSayisi = kokler[0].length;

        double[][] koklerSirali = new double[kokSayisi][2];
        for (int i = 0; i < kokSayisi; i++) {
            koklerSirali[i][0] = kokler[0][i]; // reel
            koklerSirali[i][1] = kokler[1][i]; // imajiner
        }

        // Selection Sort (reel kısmına göre küçükten büyüğe)
        for (int i = 0; i < kokSayisi - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < kokSayisi; j++) {
                if (koklerSirali[j][0] < koklerSirali[minIndex][0]) {
                    minIndex = j;
                }
            }
            double[] temp = koklerSirali[i];
            koklerSirali[i] = koklerSirali[minIndex];
            koklerSirali[minIndex] = temp;
        }

        boolean[] yazildi = new boolean[kokSayisi];
        StringBuilder sonuc = new StringBuilder();
        sonuc.append("Kökler: {");

        for (int i = 0; i < kokSayisi; i++) {

            if (yazildi[i]) continue;

            double re = yuvarla(koklerSirali[i][0], 2);
            double im = yuvarla(koklerSirali[i][1], 2);
            int katlilik = 1;

            for (int j = i + 1; j < kokSayisi; j++) {
                double re2 = yuvarla(koklerSirali[j][0], 2);
                double im2 = yuvarla(koklerSirali[j][1], 2);
                if (!yazildi[j] && re == re2 && im == im2) {
                    katlilik++;
                    yazildi[j] = true;
                }
            }

            yazildi[i] = true;

            if (!ilkYazi) sonuc.append(", ");
            ilkYazi = false; // önceki varsa virgül koy

            if (Math.abs(im) > 0) {
                sonuc.append(re + " ± " + Math.abs(im) + "i");
                if (katlilik > 2) {
                    sonuc.append(" (" + (katlilik / 2) + " katlı)");
                }
            } else {
                sonuc.append(re);
                if (katlilik > 1) {
                    sonuc.append(" (" + katlilik + " katlı)");
                }
            }

        }

        sonuc.append("}");
        System.out.println(sonuc);
    }*/


