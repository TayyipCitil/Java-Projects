package NumericalAnalysis.Bireysel;

import java.util.Scanner;

public class Polynom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double x;
        System.out.print("derece(n): ");
        n = scanner.nextInt();
        double[] diziA = new double[n + 1];//n.dereceden bir polinomun n+1 tane terimi var
        for (int i = n; i >= 0; i--) {
            if(i==n && i!=0){//başkatsayı 0 olamaz yoksa polinomun derecesi düşer (ama 0 dereceden bir polinom ise olabilir)
                do {
                    System.out.print(i + ". katsayı: ");
                    double katsayi = scanner.nextDouble();
                    if(katsayi==0.0){
                        System.out.println("Baş katsayı 0 olamaz (çünkü polinom n. değil n-1.dereceden olur.)");
                    }else {
                        diziA[i] = katsayi;// x üstü ile katsayısının indisi aynı
                        break;
                    }
                }while (true);
            }else {
                System.out.print(i + ". katsayı: ");
                double katsayi = scanner.nextDouble();
                diziA[i] = katsayi;// x üstü ile katsayısının indisi aynı
            }
        }
        System.out.print("x: ");
        x = scanner.nextDouble();
        System.out.println(polinom(diziA,x));
    }
    public static double polinom(double[] diziA, double x){
        double sonuc=diziA[diziA.length-1];
        for (int i = diziA.length-1; i >0 ; i--) {
            sonuc=diziA[i-1]+x*sonuc;
        }
        return sonuc;
    }
}
