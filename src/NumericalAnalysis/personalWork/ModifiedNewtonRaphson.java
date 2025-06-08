package NumericalAnalysis.personalWork;

public class ModifiedNewtonRaphson {//Katlı kökler için düzeltilmiş Newton Raphson
    public static void main(String[] args) {
        modifiedNewtonRaphsonMethod(0);
    }

    public static void modifiedNewtonRaphsonMethod(double x0) {// x₀ ilk tahmin
        double es = 0.5 * Math.pow(10, 2 - 6), ea;
        int iter = 0, iMax = 50;
        double x1;//x₁
        System.out.println( "╔════╦══════╦══════╦══════╗\n" +//buradaki "i"ler initial değil iterasyon anlamında
                            "║iter║  xᵢ  ║ xᵢ₊₁ ║ εₐ(%)║\n" +
                            "╠════╬══════╬══════╬══════╣");//║ ═ ╦ ╩ ╝ ╚ ╔ ╗ ╠ ╣ ╬
        do {
            x1 = x0 - (function(x0) * dFunction(x0))/(Math.pow(dFunction(x0),2)-function(x0)*d2Function(x0));
            ea = Math.abs((x1 - x0) / x1) * 100;
            System.out.printf("║%-4d║%-6.2f║%-6.2f║%-6.2f║%n", iter, x0, x1, ea);
            x0 = x1;
            iter++;
        } while (ea > es && iter < iMax);
        System.out.println("╚════╩══════╩══════╩══════╝");
    }

    //kitapta örnek 6.9 , f(x)=3x^2-10x+7 ve kök {1}
    public static double function(double x) {
        return 3 * Math.pow(x, 2) - 10 * x + 7;
    }

    public static double dFunction(double x) {//analatik 1.türev
        return 6*x-10;
    }

    public static double d2Function(double x){//analatik 2.türev
        return 6;
    }
}
