package NumericalAnalysis;
//
import java.util.Scanner;
//
public class ModifiedNewtonRaphsonHesap {//Katlı Kökler İçin Düzeltilmiş Newton-Raphson Yöntemi
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("x0: ");
            double x_0 = scanner.nextDouble();
            System.out.print("iMax: ");
            int iMax = scanner.nextInt();
            modifiedNewtonRaphsonMethodForMultipleRoots(x_0, iMax);
            System.out.print("Tekrar denemek ister misiniz(e/h)? ");
            scanner.nextLine();
            String secim = scanner.nextLine();
            if (!secim.equals("e")) {break;}
        }
    }
//
    public static void modifiedNewtonRaphsonMethodForMultipleRoots(double x_i,int iMax){
        int iter = 0;
        double  ea = 0,es = 0.5 * Math.pow(10, 2 - 6),nextX;
        double h = 1e-6;
        System.out.println( "╔═══════════════════════╦═══════════════════════╦═══════════════════════╦═══════════════════════╗\n" +//buradaki "i"ler initial değil iterasyon anlamında
                            "║         iter          ║          x_i          ║         x_i+1         ║         ea(%)         ║\n" +
                            "╠═══════════════════════╬═══════════════════════╬═══════════════════════╬═══════════════════════╣");//║ ═ ╦ ╩ ╝ ╚ ╔ ╗ ╠ ╣ ╬
        do {
            try {//kodlarda analatik türev alamayacağım için merkezi fark yöntemini kullandım.Daha az hata içermesi için ayrı bir türev metodu oluşturmadım
                double dfx=(function(x_i+h)-function(x_i-h))/(2*h);// dfx = f′(x)
                double d2fx=(function(x_i+h)-2*function(x_i)+function(x_i-h))/(h*h);// d2fx = f′′(x)
                nextX =x_i-(function(x_i)*dfx)/(dfx*dfx-function(x_i)*d2fx);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                break;
            }
            if (nextX != 0) {
                ea = Math.abs((nextX - x_i) / nextX) * 100;
                System.out.printf("║%15d\t\t║%15.6f\t\t║%15.6f\t\t║%15.6f\t\t║%n", iter, x_i, nextX, ea);
            }
            if (ea < es || iter >= iMax) {
                System.out.println("╚═══════════════════════╩═══════════════════════╩═══════════════════════╩═══════════════════════╝");
                break;
            }
            iter++;
            x_i=nextX;
        } while (true);
    }
//kitapta örnek 6.9 , f(x)=x^3-5x^2+7x-3 ve kökleri {1,3} 1 çift katlı kök
    public static double function(double x){
        return x*x*x-5*x*x+7*x-3;
    }
}