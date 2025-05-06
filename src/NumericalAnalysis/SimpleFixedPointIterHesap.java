package NumericalAnalysis;

import java.util.Scanner;
//
public class SimpleFixedPointIterHesap {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("x0: ");
            double x0 = scanner.nextDouble();
            System.out.print("iMax: ");
            int iMax = scanner.nextInt();
            simpleFixedPointIter(x0, iMax);
            System.out.print("Tekrar denemek ister misiniz(e/h)? ");
            scanner.nextLine();
            String secim = scanner.nextLine();
            if (!secim.equals("e")) {break;}
        }
    }
//
    public static void simpleFixedPointIter(double x0,int iMax){
            int iter = 0;
            double xRoot = x0, xRootOld;
            double es = 0.5 * Math.pow(10, 2 - 8), ea = 0;
            System.out.println( "╔═══════════════════════╦═══════════════════════╦═══════════════════════╦═══════════════════════╗\n" +
                                "║         iter          ║          x0           ║         xRoot         ║         ea(%)         ║\n" +
                                "╠═══════════════════════╬═══════════════════════╬═══════════════════════╬═══════════════════════╣");//║ ═ ╦ ╩ ╝ ╚ ╔ ╗ ╠ ╣ ╬
            do {
                xRootOld = xRoot;
                try {
                    xRoot = function(xRootOld);// c_i+1=g(c_i)
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    break;
                }
                iter++;
                if (xRoot != 0) {
                    ea = Math.abs((xRoot - xRootOld) / xRoot) * 100;
                    System.out.printf("║%15d\t\t║%15.8f\t\t║%15.8f\t\t║%15.8f\t\t║%n", iter, xRootOld, xRoot, ea);
                }
                if (ea < es || iter > iMax) {
                    System.out.println("╚═══════════════════════╩═══════════════════════╩═══════════════════════╩═══════════════════════╝");
                    break;
                }
            } while (true);
    }
//
    public static double function(double c){
        if(c==0){
            throw new ArithmeticException("c=0 olamaz");
        }
        return (667.38/c)*(1-Math.exp(-0.146843*c))-40+c;//f(c)=0 dan elde ettiğimiz c=g(c)
    }
}