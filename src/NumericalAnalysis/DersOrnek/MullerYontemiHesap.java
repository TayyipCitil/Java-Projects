package NumericalAnalysis.DersOrnek;
import java.util.Arrays;
import java.util.Scanner;

public class MullerYontemiHesap {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("derece(n): "); //kullanacağımız function x^3-13x-12
            int n = scanner.nextInt();
            double[] diziA=new double[n+1];
            for(int i=n;i>0;i--){
                System.out.print(i+ ". katsayı: ");
                double katsayi= scanner.nextDouble();
                diziA[i]=katsayi;
            }
            System.out.print("iMax: ");
            int iMax = scanner.nextInt();
            System.out.print("xr: ");
            double xr = scanner.nextDouble();
            System.out.print("h: ");
            double h = scanner.nextDouble();
            mullerMethods(diziA,iMax,xr,h);
            System.out.print("Tekrar denemek ister misiniz(e/h)? ");
            scanner.nextLine();
            String secim = scanner.nextLine();
            if (!secim.equals("e")) {break;}
        }
    }

    public static void mullerMethods(double[] diziA,int iMax,double xr,double h){
        double h0,h1,delta0,delta1;
        double[] bos=new double[diziA.length];
        Arrays.fill(bos,0);
        int iter=0;
        double es=0.5*Math.pow(10,2-8);
        double x0=xr-xr*h;
        double x1=xr+xr*h;
        double x2=xr;

        System.out.println( "╔═══════════════════════╦═══════════════════════╦═══════════════════════╗\n" +
                            "║         iter          ║          xr           ║         ea(%)         ║\n" +
                            "╠═══════════════════════╬═══════════════════════╬═══════════════════════╣");//║ ═ ╦ ╩ ╝ ╚ ╔ ╗ ╠ ╣ ╬
        System.out.printf("║%15d\t\t║%15.8f\t\t║%15s\t\t║%n", iter, xr, "hesaplanamaz");
        do {
            do {
                double f0 = functionYaz(diziA, x0);

                double f1 = functionYaz(diziA, x1);
                double f2 = functionYaz(diziA, x2);
                iter++;
                h0 = x1 - x0;
                h1 = x2 - x1;
                delta0 = (f1 - f0) / h0;
                delta1 = (f2 - f1) / h1;
                double a = (delta1 - delta0) / (h1 + h0);
                double b = a * h1 + delta1;
                double c = f2;
                double rad = Math.sqrt(b * b - 4 * a * c);
                double den;
                if (Math.abs(b + rad) > Math.abs(b - rad)) {
                    den = b + rad;
                } else {
                    den = b - rad;
                }
                double dxr = (-2 * c / den);
                xr = x2 + dxr;
                double ea = Math.abs(((xr - x2) / xr) * 100);
                System.out.printf("║%15d\t\t║%15.8f\t\t║%15.8f\t\t║%n", iter, xr, ea);
                if (Math.abs(dxr) < ea * xr || iter > iMax || ea < es) {
                    break;
                }
                x0 = x1;
                x1 = x2;
                x2 = xr;
            } while (true);
            if(true/*!diziA.equals(bos)*/){
                System.out.println("╚═══════════════════════╩═══════════════════════╩═══════════════════════╝");
                break;
            }
        }while (true);

    }

    public static double functionYaz(double[] diziA,double x){
        double f=0;
        for(int i= diziA.length-1;i>0;i--){
            f += diziA[i]*Math.pow(x,i);
        }
        return f;
    }
}
