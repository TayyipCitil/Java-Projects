package NumericalAnalysis.personalWork;

public class Secant {
    public static void main(String[] args) {
        secantMethod(0,1);
    }
    public static void secantMethod(double x_1,double x0){//x₋₁ ve x₀ ilk tahminler
        double es = 0.5 * Math.pow(10, 2 - 6), ea;
        int iter = 0, iMax = 50;
        double x1;// x₁
        System.out.println( "╔════╦══════╦══════╦══════╦══════╗\n" +//buradaki "i"ler initial değil iterasyon anlamında
                            "║iter║ xᵢ₋₁ ║  xᵢ  ║ xᵢ₊₁ ║ εₐ(%)║\n" +
                            "╠════╬══════╬══════╬══════╬══════╣");//║ ═ ╦ ╩ ╝ ╚ ╔ ╗ ╠ ╣ ╬
        do{
            x1=x0-(function(x0)*(x_1-x0)/(function(x_1)-function(x0)));//bu formul geriye türevi kendi içinde hesaplıyo böylece yuvarlama hatası azalıyor
            ea=Math.abs((x1-x0)/x1)*100;
            System.out.printf("║%-4d║%-6.2f║%-6.2f║%-6.2f║%-6.2f║%n", iter, x_1, x0, x1, ea);
            x_1=x0;
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
