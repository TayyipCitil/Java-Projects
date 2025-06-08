package NumericalAnalysis.personalWork;

public class ModifiedFalsePosition {
    public static void main(String[] args) {
        modifiedFalsePosition(0,1.3);
    }
    public static void modifiedFalsePosition(double xA, double xU){// xₐ ve xᵤ ilk tahminler
        double es = 0.5 * Math.pow(10, 2 - 6), ea;
        int iter = 0, iMax = 50;
        double fa=function(xA),fu=function(xU);//xR=xᵣ
        double xR=xU-((fu*(xA-xU))/(fa-fu)),xRootOld;
        int ardArdaUstenYaklasma=0,ardArdaAlttanYaklasma=0;
        System.out.println( "╔════╦══════╦══════╦══════╦══════╗\n" +//buradaki "i"ler initial değil iterasyon anlamında
                            "║iter║  xₐ  ║  xᵤ  ║  xᵣ  ║ εₐ(%)║\n" +
                            "╠════╬══════╬══════╬══════╬══════╣");//║ ═ ╦ ╩ ╝ ╚ ╔ ╗ ╠ ╣ ╬
        System.out.printf("║%-4d║%-6.2f║%-6.2f║%-6.2f║%-6s║%n", iter, xA, xU, xR, "-");
        do{
            double test=fa*function(xR);
            if(test<0){
                xU=xR;
                fu=function(xU);
                ardArdaUstenYaklasma++;
                ardArdaAlttanYaklasma=0;
                if(ardArdaUstenYaklasma>=2){fa=fa/2;}
            }else if(test>0){
                xA=xR;
                fa=function(xA);
                ardArdaAlttanYaklasma++;
                ardArdaUstenYaklasma=0;
                if(ardArdaAlttanYaklasma>=2){fu=fu/2;}
            }else {//f(xR)=0 kök bulundu
                break;
            }
            iter++;
            xRootOld=xR;
            xR=xU-((fu*(xA-xU))/(fa-fu));
            ea=Math.abs((xR-xRootOld)/xR)*100;
            System.out.printf("║%-4d║%-6.2f║%-6.2f║%-6.2f║%-6.2f║%n", iter, xA, xU, xR, ea);
        }while (ea > es && iter < iMax);
        System.out.println("╚════╩══════╩══════╩══════╩══════╝");
    }

    //kitapta örnek 5.6 , f(x)=(x^10)-1 ve kök {1}
    public static double function(double x) {
        return Math.pow(x,10) - 1;
    }
}
