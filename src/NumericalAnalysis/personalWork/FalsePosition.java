package NumericalAnalysis.personalWork;

public class FalsePosition {
    public static void main(String[] args) {
        biSection(0,1.3);
    }
    public static void biSection(double xA,double xU){// xₐ ve xᵤ ilk tahminler
        double es = 0.5 * Math.pow(10, 2 - 6), ea;
        int iter = 0, iMax = 50;
        double xR;//xᵣ
        System.out.println( "╔════╦══════╦══════╦══════╦══════╗\n" +//buradaki "i"ler initial değil iterasyon anlamında
                            "║iter║  xₐ  ║  xᵤ  ║  xᵣ  ║ εₐ(%)║\n" +
                            "╠════╬══════╬══════╬══════╬══════╣");//║ ═ ╦ ╩ ╝ ╚ ╔ ╗ ╠ ╣ ╬
        do{
            xR=xU-((function(xU)*(xA-xU))/(function(xA)-function(xU)));
            double test=function(xA)*function(xR);
            if(test<0){
                xU=xR;
            }else if(test>0){
                xA=xR;
            }else {//f(xR)=0 kök bulundu
                break;
            }
            ea=Math.abs((xU-xA)/(xU+xA))*100;
            System.out.printf("║%-4d║%-6.2f║%-6.2f║%-6.2f║%-6.2f║%n", iter, xU, xA, xR, ea);
            iter++;
        }while (ea > es && iter < iMax);
        System.out.println("╚════╩══════╩══════╩══════╩══════╝");
    }

    //kitapta örnek 5.6 , f(x)=(x^10)-1 ve kök {1}
    public static double function(double x) {
        return Math.pow(x,10) - 1;
    }
}
