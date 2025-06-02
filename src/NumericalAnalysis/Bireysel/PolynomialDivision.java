package NumericalAnalysis.Bireysel;

import java.util.Arrays;

public class PolynomialDivision {
    public static void main(String[] args) {
        double[] a={5,-1,3,2};//n=3 not=katsayıların büyük dereceliden sabit terime doğru yaz
        double[] d={-2,1};//m=1
        polynomialDivision(a,d);
    }
    public static void polynomialDivision(double[] a,double[] d){
        int n=a.length-1;
        int m=d.length-1;
        int qDegree=n-m;
        double[] q=new double[qDegree+1];

        for(int i=qDegree;i>=0;i--){
            q[i]=a[n]/d[m];
            for(int j=0;j<=m;j++){
                a[n-j]=a[n-j]-q[i]*d[m-j];
            }
            n--;
        }
        double[] r=Arrays.copyOfRange(a,0,m);
        System.out.print("q= ");
        toStringPolynomial(q);
        System.out.print("r= ");
        toStringPolynomial(r);

    }
    public static void toStringPolynomial(double[] dizi){
        System.out.print("{ ");
        for (double e:dizi){
            System.out.print(e+", ");
        }
        System.out.println("\b\b }");
    }
}
