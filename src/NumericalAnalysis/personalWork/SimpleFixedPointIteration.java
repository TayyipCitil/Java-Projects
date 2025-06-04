package NumericalAnalysis.personalWork;

public class SimpleFixedPointIteration {
    public static void main(String[] args) {
        simpleFixedPointIter(0.55);
    }
    public static void simpleFixedPointIter(double x0){
        double es = 0.5 * Math.pow(10, 2 - 6), ea;
        int iter = 0, iMax = 50;
        double x1;//x₁
        System.out.println( "╔════╦══════╦══════╦══════╗\n" +//buradaki "i"ler initial değil iterasyon anlamında
                            "║iter║  xᵢ  ║ xᵢ₊₁ ║ εₐ(%)║\n" +
                            "╠════╬══════╬══════╬══════╣");//║ ═ ╦ ╩ ╝ ╚ ╔ ╗ ╠ ╣ ╬
        do {
            x1=functionG(x0);
            ea = Math.abs((x1 - x0) / x1) * 100;
            System.out.printf("║%-4d║%-6.2f║%-6.2f║%-6.2f║%n", iter, x0, x1, ea);
            x0 = x1;
            iter++;
        }while (ea > es && iter < iMax);
        System.out.println("╚════╩══════╩══════╩══════╝");
    }

    //kitapta örnek 6.8 , f(x)=(e^-x)-x ve kök {0.567143...}
    public static double functionG(double x) {
        return Math.exp(-x) ;// // xᵢ₊₁ = g(xᵢ) , g(x) i elde etmek için eşitliğin her iki yanına da x ekledik
    }
}
