package NumericalAnalysis.personalWork;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Polynomial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double[] coefficients;//katsayılar dizisi
        do{
            try {//n tamsayı olmak zorunda
                System.out.print("derece(n): ");
                n = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Bu bir polinom değil.Polinomların dereceleri doğal sayılardır(0,1,2,...)");
                continue;
            }
            if (n < 0) {
                System.out.println("Bu bir polinom değil.Polinomların dereceleri doğal sayılardır(0,1,2,...)");
                continue;
            }
            break;
        }while(true);
        coefficients = new double[n + 1];//n.dereceden bir polinomun n+1 tane terimi var
        for (int i = n; i >= 0; i--) {
            if (i == n && i != 0) {//başkatsayı 0 olamaz yoksa polinomun derecesi düşer (ama 0 dereceden bir polinom ise olabilir)
                do {
                    System.out.print(i + ". katsayı: ");
                    double katsayi = scanner.nextDouble();
                    if (katsayi == 0.0) {
                        System.out.println("Baş katsayı 0 olamaz (çünkü polinom n. değil n-1.dereceden olur.)");
                    } else {
                        coefficients[i] = katsayi;// x üstü ile katsayısının indisi aynı
                        break;
                    }
                } while (true);
            } else {
                System.out.print(i + ". katsayı: ");
                coefficients[i] = scanner.nextDouble();// x üstü ile katsayısının indisi aynı
            }
        }
        polynomialToString(coefficients);
    }

    public static double polynomialCreation(double[] coefficients, double x) {//polinom olusturup x için değerini verir
        double f = coefficients[coefficients.length - 1];
        for (int i = coefficients.length - 1; i > 0; i--) {
            f = coefficients[i - 1] + x * f;
        }
        return f;
    }

    public static void polynomialDivision(double[] a,double[] d){
        int n=a.length-1;
        int m=d.length-1;
        int qDegree=n-m;
        double[] q=new double[qDegree+1];
        for(int i=qDegree;i>=0;i--){
            q[i]=a[n]/d[m];
            for(int j=0;j<=m;j++){
                a[n-j]=a[n-j]-q[i]*d[m-j];
            }
            n--;
        }
        double[] r=Arrays.copyOfRange(a,0,m);
        System.out.print("q= ");
        polynomialToString(q);
        System.out.print("r= ");
        polynomialToString(r);
    }

    public static double[] polynomialDeflation(double[] coefficients, double t) {// t: bildiğimiz kök
        int n = coefficients.length - 1;
        double temp1 = coefficients[n];
        coefficients[n] = 0;
        for (int i = n; i >= 2; i--) {
            double temp2 = coefficients[i - 1];
            coefficients[i - 1] = temp1;
            temp1 = temp2 + temp1 * t;
        }
        n--;
        return Arrays.copyOf(coefficients, n + 1);
    }

    public static void polynomialToString(double[] coefficients) {//polinomu yazdırma
        for (int i = coefficients.length - 1; i >= 0; i--) {
            if (coefficients[i] < 0) {
                if (i == 0) {
                    System.out.print(coefficients[i]);
                } else if (i == 1) {
                    System.out.print(coefficients[i] + "x");
                } else {
                    System.out.print(coefficients[i] + "x^" + i);
                }
            } else if (coefficients[i] > 0) {
                if (i == 0) {
                    System.out.print("+" + coefficients[i]);
                } else if (i == 1) {
                    System.out.print("+" + coefficients[i] + "x");
                } else {
                    System.out.print("+" + coefficients[i] + "x^" + i);
                }
            }
        }
    }

}