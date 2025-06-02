package NumericalAnalysis;

import java.util.Scanner;
//
public class NewtonRaphsonHesap {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("x0: ");
            double x0 = scanner.nextDouble();
            System.out.print("iMax: ");
            int iMax = scanner.nextInt();
            newtonRaphson(x0, iMax);
            System.out.print("Tekrar denemek ister misiniz(e/h)? ");
            scanner.nextLine();
            String secim = scanner.nextLine();
            if (!secim.equals("e")) {break;}
        }
    }
//
    public static void newtonRaphson(double x0, int iMax){
        int iter = 0;
        double xRoot = x0, xRootOld;
        double es = 0.5 * Math.pow(10, 2 - 8), ea = 0;
        double h = 1e-6;
        System.out.println( "╔═══════════════════════╦═══════════════════════╦═══════════════════════╦═══════════════════════╗\n" +
                            "║         iter          ║          x0           ║         xRoot         ║         ea(%)         ║\n" +
                            "╠═══════════════════════╬═══════════════════════╬═══════════════════════╬═══════════════════════╣");//║ ═ ╦ ╩ ╝ ╚ ╔ ╗ ╠ ╣ ╬
        do {
            xRootOld = xRoot;
            try {//türev almak için merkezi fark yöntemini kullandım.Daha az hata içermesi için ayrı bir türev metodu oluşturmadım
                xRoot =xRootOld-(function(xRootOld)/((function(xRootOld + h) - function(xRootOld - h)) / (2 * h)));
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                break;
            }
            iter++;
            if (xRoot != 0) {
                ea = Math.abs((xRoot - xRootOld) / xRoot) * 100;
                System.out.printf("║%15d\t\t║%15.8f\t\t║%15.8f\t\t║%15.8f\t\t║%n", iter, xRootOld, xRoot, ea);
            }
            if (ea < es || iter >= iMax) {
                System.out.println("╚═══════════════════════╩═══════════════════════╩═══════════════════════╩═══════════════════════╝");
                break;
            }
        } while (true);
    }
//
    public static double function2(double c){//paraşütçü problermi
        if(c==0){
            throw new ArithmeticException("c=0 olamaz");
        }
        return (667.38/c)*(1-Math.exp(-0.146843*c))-40;
    }
    public static double function(double v){//Kitapta örnek 8.3
        double p=10,n=1,R=0.082054,T=300,a=3.592,b=0.04267;
        return (p+a/(v*v))*(v-b)-R*T;
    }
}