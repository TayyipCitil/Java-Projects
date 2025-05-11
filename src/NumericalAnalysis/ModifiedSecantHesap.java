package NumericalAnalysis;
//
import java.util.Scanner;
//
public class ModifiedSecantHesap {//Düzeltilmiş Sekant Yöntem
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("x_0: ");
            double x_0 = scanner.nextDouble();
            System.out.print("δx_0: ");
            double smallDeltaX_0 = scanner.nextDouble();
            System.out.print("iMax: ");
            int iMax = scanner.nextInt();
            modifiedSecantMothod(x_0,smallDeltaX_0, iMax);
            System.out.print("Tekrar denemek ister misiniz(e/h)? ");
            scanner.nextLine();
            String secim = scanner.nextLine();
            if (!secim.equals("e")) {break;}
        }
    }
//
    public static void modifiedSecantMothod(double x_i,double smallDeltaX_i,int iMax){// δ=smallDelta
        int iter=0;
        double ea=0,es=0.5 * Math.pow(10, 2 - 6),nextX,nextSmallDeltaX; // nextX = x_i+1 , nextSmallDeltaX = smallDeltaX_i+1
        System.out.println( "╔═══════════════════════╦═══════════════════════╦═══════════════════════╦═══════════════════════╦═══════════════════════╗\n" +//buradaki "i"ler initial değil iterasyon anlamında
                            "║         iter          ║          x_i          ║         δx_i          ║         x_i+1         ║         ea(%)         ║\n" +
                            "╠═══════════════════════╬═══════════════════════╬═══════════════════════╬═══════════════════════╬═══════════════════════╣");//║ ═ ╦ ╩ ╝ ╚ ╔ ╗ ╠ ╣ ╬
        do {
            if (x_i == 0.0) {//eğer 0 olursa δx= infinity olur
                x_i = 1e-5;//10^-5
            }
            try {
                nextX=x_i-((function(x_i)*smallDeltaX_i)/(function(x_i+smallDeltaX_i)-function(x_i)));
                nextSmallDeltaX=nextX*(smallDeltaX_i/x_i);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                break;
            }
            if (nextX != 0) {
                ea = Math.abs((nextX - x_i) / nextX) * 100;
                System.out.printf("║%15d\t\t║%15.6f\t\t║%15.6f\t\t║%15.6f\t\t║%15.6f\t\t║%n", iter, x_i,smallDeltaX_i, nextX, ea);
            }
            if (ea < es || iter >= iMax) {
                System.out.println("╚═══════════════════════╩═══════════════════════╩═══════════════════════╩═══════════════════════╩═══════════════════════╝");
                break;
            }
            iter++;
            x_i=nextX;
            smallDeltaX_i=nextSmallDeltaX;
        } while (true);
    }
//kitapta örnek 6.8 , f(x)=(e^-x)-x ve kök {0.567143...}
    public static double function(double x){
        return Math.exp(-x)-x;
    }
}