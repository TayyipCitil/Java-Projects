package NumericalAnalysis.personalWork;

public class Derivative {
    public static void main(String[] args) {
        System.out.println("Gerçek sonuç: "+derivativeOfFunction(5));
        System.out.println(ileriFarkYontemi(5));
        System.out.println(geriFarkYontemi(5));
        System.out.println(merkeziFarkYontemi(5));
    }

    //kitapta örnek 6.8 , f(x)=(e^-x)-x ve kök {0.567143...}
    public static double function(double x){
        return Math.exp(-x)-x;
    }

    public static double derivativeOfFunction(double x){//analatik türev
        return -Math.exp(-x)-1;
    }

    public static double ileriFarkYontemi(double x){
        double h = 1e-6;
        return (function(x+h)-function(x))/h;
    }
    public static double geriFarkYontemi(double x){
        double h = 1e-6;
        return (function(x)-function(x-h))/h;
    }
    public static double merkeziFarkYontemi(double x){
        double h = 1e-6;
        return (function(x+h)-function(x-h))/(2*h);
    }


}
