package NumericalAnalysis.personalWork;

public class Bairstow {
    public static void main(String[] args) {
        //kitapta örnek 7.3 , f(x)=(x^5)-3.5(x^4)+2.75(x^3)+2.125(x^2)-3.875x+1.25 ve kökler {-1, 0.5, 2, 1±0.5i}
        double[] coefficients = {1.25, -3.875, 2.125, 2.75, -3.5, 1};
        bairstowMethod(coefficients, -1, -1);
    }

    public static void bairstowMethod(double[] coefficients, double r, double s) {
        double es = 0.5 * Math.pow(10, 2 - 6), ea_s = 0, ea_r = 0;
        int iter = 0, iMax = 50;
        int n = coefficients.length - 1;
        double dr, ds;
        double[] b = new double[n + 1], c = new double[n + 1];
        double[][] tempRoots,roots = new double[2][n];// 0.satır reel kısım, 1.satır imejiner kısım için

        while(n>=3){
            do {
                iter++;
                b[n] = coefficients[n];
                b[n - 1] = coefficients[n - 1] + r * b[n];
                for (int i = n - 2; i >= 0; i--) {
                    b[i] = coefficients[i] + r * b[i + 1] + s * b[i + 2];
                }

                c[n] = b[n];
                c[n - 1] = b[n - 1] + r * c[n];
                for (int i = n - 2; i >= 0; i--) {
                    c[i] = b[i] + r * c[i + 1] + s * c[i + 2];
                }

                double det = c[2] * c[2] - c[1] * c[3];
                if (det != 0) {
                    dr = (b[0] * c[3] - b[1] * c[2]) / det;
                    ds = (b[1] * c[1] - b[0] * c[2]) / det;
                    r += dr;
                    s += ds;
                    if (r != 0) {
                        ea_r = Math.abs(dr / r) * 100;
                    }
                    if (s != 0) {
                        ea_s = Math.abs(ds / r) * 100;
                    }
                } else {
                    r++;
                    s++;
                    iter = 0;
                }
            } while (ea_r > es && ea_s > es && iter < iMax );
            tempRoots = quadraticFormulaMethod(r, s);
            roots[0][n-1] = tempRoots[0][0];//reel0
            roots[1][n-1] = tempRoots[1][0];//imejiner0
            roots[0][n - 2] = tempRoots[0][1];//reel1
            roots[1][n - 2] = tempRoots[1][1];//imejiner1
            n = n - 2;
            for (int i = 0; i <= n; i++) {
                coefficients[i] = b[i + 2];
            }
        }

        if(n==2){
            r=-coefficients[1]/coefficients[2];
            s=-coefficients[0]/coefficients[2];
            tempRoots=quadraticFormulaMethod(r,s);
            roots[0][n-1] = tempRoots[0][0];//reel0
            roots[1][n-1] = tempRoots[1][0];//imejiner0
            roots[0][n - 2] = tempRoots[0][1];//reel1
            roots[1][n - 2] = tempRoots[1][1];//imejiner1
        }else{//n=1 ,tek kök var
            roots[0][n-1] = -coefficients[0]/coefficients[1];//reel0
            roots[1][n-1] = 0;//imejiner0
        }

        //kökleri ekrana yazdırma
        StringBuilder str=new StringBuilder();
        str.append("Kökler = {  ");
        for (int i = 0; i < roots[0].length; i++) {
            if(roots[1][i]<0) {
                str.append(String.format("%.2f%.2fi, ", roots[0][i], roots[1][i]));
            }else if(roots[1][i]>0){
                str.append(String.format("%.2f+%.2fi, ", roots[0][i], roots[1][i]));
            }else {
                str.append(String.format("%.2f, ", roots[0][i]));
            }
        }
        str.append("\b\b }");
        System.out.println(str);
    }

    //quadratic kök bulma algoritmasını x^2-rx-s için biraz düzenledik
    public static double[][] quadraticFormulaMethod(double r, double s) {//Discriminant Method
        double[][] roots = new double[2][2];// 0.satır reel kısım, 1.satır imejiner kısım için
        double discriminant = r * r + 4 * s;
        if (discriminant >= 0) {
            roots[0][0] = (r - Math.sqrt(discriminant)) / 2;//reel0
            roots[1][0] = 0;//imejiner0
            roots[0][1] = (r + Math.sqrt(discriminant)) / 2;//reel1
            roots[1][1] = 0;//imejiner1
        } else if (discriminant < 0) {
            roots[0][0] = r / 2;//reel0
            roots[1][0] = -Math.sqrt(-discriminant) / 2;//imejiner0
            roots[0][1] = r / 2;//reel1
            roots[1][1] = Math.sqrt(-discriminant) / 2;//imejiner1
        }
        return roots;
    }
}