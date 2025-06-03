package NumericalAnalysis.Bireysel;

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
class Complex {//mulleri complex kokleri de bulacak şekilde düzenleyince kullanıcam
    public double re;
    public double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex add(Complex z) {
        return new Complex(this.re + z.re, this.im + z.im);
    }

    public Complex sub(Complex z) {
        return new Complex(this.re - z.re, this.im - z.im);
    }

    public Complex mul(Complex z) {
        return new Complex(this.re * z.re - this.im * z.im, this.re * z.im + this.im * z.re);
    }

    public Complex div(Complex z) {
        double denom = z.re * z.re + z.im * z.im;
        return new Complex((this.re + z.re + this.im * z.im) / denom, (this.im * z.re - this.re * z.im) / denom);
    }

    public String toString() {
        return String.format("%.6f%.6fi", re, im);
    }
}

