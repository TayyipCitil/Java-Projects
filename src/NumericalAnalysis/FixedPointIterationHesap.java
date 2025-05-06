package NumericalAnalysis;
//
import java.util.Scanner;
//
public class FixedPointIterationHesap {//Doğrusal Olmayan Sistemler için Sabit Noktalı İterasyon
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("x_0: ");
            double x_0 = scanner.nextDouble();
            System.out.print("y_0: ");
            double y_0 = scanner.nextDouble();
            System.out.print("iMax: ");
            int iMax = scanner.nextInt();
            fixedPointIterationForNonlinearSystem(x_0,y_0, iMax);
            System.out.print("Tekrar denemek ister misiniz(e/h)? ");
            scanner.nextLine();
            String secim = scanner.nextLine();
            if (!secim.equals("e")) {break;}
        }
    }
//
    public static void fixedPointIterationForNonlinearSystem(double x_i,double y_i,int iMax){
        int iter=0;
        double eaX=0,eaY=0,es=0.5*Math.pow(10,2-6),nextX,nextY;//nextX = x_i+1, nextY = y_i+1
        System.out.println( "╔═══════════════╦═══════════════╦═══════════════╦═══════════════╦═══════════════╦═══════════════╦═══════════════╗\n" +//buradaki "i"ler initial değil iterasyon anlamında
                            "║     iter      ║      x_i      ║      y_i      ║     x_i+1     ║     y_i+1     ║     εₐX(%)    ║     εₐY(%)    ║\n" +
                            "╠═══════════════╬═══════════════╬═══════════════╬═══════════════╬═══════════════╬═══════════════╬═══════════════╣");//║ ═ ╦ ╩ ╝ ╚ ╔ ╗ ╠ ╣ ╬
        do {
            try {
                nextX = function1(x_i,y_i);
                nextY = function2(nextX,y_i);// x_i+1 değerini kullanıcaz
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                break;
            }
            if (x_i != 0 || y_i != 0 ) {
                eaX = Math.abs((nextX - x_i) / nextX) * 100;
                eaY = Math.abs((nextY - y_i) / nextY) * 100;
                System.out.printf("║%10d\t\t║%10.6f\t\t║%10.6f\t\t║%10.6f\t\t║%10.6f\t\t║%10.6f\t\t║%10.6f\t\t║%n", iter, x_i, y_i,nextX,nextY, eaX,eaY);
            }
            if (eaX < es && eaY <es || iter >= iMax) {
                System.out.println("╚═══════════════╩═══════════════╩═══════════════╩═══════════════╩═══════════════╩═══════════════╩═══════════════╝");
                break;
            }
            iter++;
            x_i=nextX;
            y_i=nextY;
        } while (true);
    }
//kitapta örnek 6.10 kökler {2,3}
    public static double function1(double x,double y){// u(x,y) = x^2 + xy -10 = 0  düzenlenerek function1 elde edildi
        return Math.sqrt(10-x*y);
    }
    public static double function2(double x,double y){// v(x,y) = y + 3x(y^2) - 57 = 0  düzenlenerek function2 elde edildi
        return Math.sqrt((57-y)/(3*x));
    }
}