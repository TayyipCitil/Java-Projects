package NumericalAnalysis.personalWork;

public class NewtonRaphson {
    public static void main(String[] args) {
        newtonRaphsonMethod(0);
    }

    public static void newtonRaphsonMethod(double x0) {// x₀ ilk tahmin
        double es = 0.5 * Math.pow(10, 2 - 6), ea;
        int iter = 0, iMax = 50;
        double x1;//x₁
        System.out.println( "╔════╦══════╦══════╦══════╗\n" +//buradaki "i"ler initial değil iterasyon anlamında
                            "║iter║  xᵢ  ║ xᵢ₊₁ ║ εₐ(%)║\n" +
                            "╠════╬══════╬══════╬══════╣");//║ ═ ╦ ╩ ╝ ╚ ╔ ╗ ╠ ╣ ╬
        do {
            x1 = x0 - (function(x0) / dFunction(x0));
            ea = Math.abs((x1 - x0) / x1) * 100;
            System.out.printf("║%-4d║%-6.2f║%-6.2f║%-6.2f║%n", iter, x0, x1, ea);
            x0 = x1;
            iter++;
        } while (ea > es && iter < iMax);
        System.out.println("╚════╩══════╩══════╩══════╝");
    }

    //kitapta örnek 6.8 , f(x)=(e^-x)-x ve kök {0.567143...}
    public static double function(double x) {
        return Math.exp(-x) - x;
    }

    public static double dFunction(double x) {//analatik türev
        return -Math.exp(-x) - 1;
    }
}
