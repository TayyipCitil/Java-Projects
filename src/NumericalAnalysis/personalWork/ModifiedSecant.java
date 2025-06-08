package NumericalAnalysis.personalWork;

public class ModifiedSecant {
    public static void main(String[] args) {
        modifiedSecantMethod(1,0.01);
    }
    public static void modifiedSecantMethod(double x0, double smallDeltaX0){//x₀ ve δx₀
        double es = 0.5 * Math.pow(10, 2 - 6), ea;
        int iter = 0, iMax = 50;
        double x1;// x₁
        System.out.println( "╔════╦══════╦══════╦══════╦══════╗\n" +//buradaki "i"ler initial değil iterasyon anlamında
                            "║iter║  xᵢ  ║ δxᵢ  ║ xᵢ₊₁ ║ εₐ(%)║\n" +
                            "╠════╬══════╬══════╬══════╬══════╣");//║ ═ ╦ ╩ ╝ ╚ ╔ ╗ ╠ ╣ ╬
        do{
            x1=x0-(function(x0)*smallDeltaX0)/(function(x0+smallDeltaX0)-function(x0));
            ea=Math.abs((x1-x0)/x1)*100;
            System.out.printf("║%-4d║%-6.3f║%-6.3f║%-6.3f║%-6.2f║%n", iter, x0, smallDeltaX0, x1, ea);
            smallDeltaX0=(smallDeltaX0/x0)*x1;
            x0=x1;
            iter++;
        }while (ea > es && iter < iMax);
        System.out.println("╚════╩══════╩══════╩══════╩══════╝");
    }
    //kitapta örnek 6.8 , f(x)=(e^-x)-x ve kök {0.567143...}
    public static double function(double x){
        return Math.exp(-x)-x;
    }
}
