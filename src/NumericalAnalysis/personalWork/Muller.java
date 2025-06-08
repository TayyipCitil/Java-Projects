package NumericalAnalysis.personalWork;

public class Muller {
    /*Muller ile derece düşürmeyi birleştirip genel bir kok bulma kodu yazıcam ama şimdilik sadece tek bir rrel kok bulan muller
    ama belkide bunu ayrı bir sınıfta yapmalıyım yani elimde bir tane sade Muller sınıfı bir de MullerAndDeflation.
    MullerAndDeflation aynı zamanda complex kokler için de özelleştirilmeli
    Böylece her bir yöntemi en yalın haliyle görüp hızlıca tekrar edebilirsin yani bunu diyerleri için de yapmak faydalı olur bir
    package oluştur ve en yalın anlaşılır halleri oraya topla
     */

    public static void main(String[] args) {
        mullerMethod(4.5, 5.5, 5);
    }

    public static void mullerMethod(double x0, double x1, double x2) {
        double es = 0.5 * Math.pow(10, 2 - 6), ea;
        int iter = 0, iMax = 50;
        double f0, f1, f2, h0, h1, d0, d1, a, b, c, diskriminant, x3;//d0=δx₀ ve d1=δx₁
        System.out.println( "╔════╦══════╦══════╦══════╦══════╦══════╗\n" +//buradaki "i"ler initial değil iterasyon anlamında
                            "║iter║  x₀  ║  x₁  ║  x₂  ║  x₃  ║ εₐ(%)║\n" +
                            "╠════╬══════╬══════╬══════╬══════╬══════╣");//║ ═ ╦ ╩ ╝ ╚ ╔ ╗ ╠ ╣ ╬
        do {
            f0 = function(x0);
            f1 = function(x1);
            f2 = function(x2);
            h0 = x1 - x0;
            h1 = x2 - x1;
            d0 = (f1 - f0) / h0;
            d1 = (f2 - f1) / h1;
            c = f2;
            a = (d1 - d0) / (h1 + h0);
            b = a * h1 + d1;
            diskriminant = b * b - 4 * a * c;

            if (diskriminant >= 0) {//pozitifse 2 reel kok var birini seçicez sıfırsa çift katlı kök yavaş yakınsar
                if (-b > 0) {// -b ile kök diskriminant aynı işaretli olsun istiyoruz
                    x3 = x2 + 2 * c / (-b + Math.sqrt(diskriminant));
                } else {
                    x3 = x2 + 2 * c / (-b - Math.sqrt(diskriminant));
                }
            } else {
                System.out.println("Complex kökler için düzenlenmedi");
                break;
            }
            iter++;
            ea = Math.abs((x3 - x2) / x3) * 100;

            System.out.printf("║%-4d║%-6.2f║%-6.2f║%-6.2f║%-6.2f║%6.2f║%n", iter, x0, x1, x2, x3, ea);
            x0 = x1;
            x1 = x2;
            x2 = x3;
        } while (ea > es && iter < iMax);
        System.out.println("╚════╩══════╩══════╩══════╩══════╩══════╝");
    }

    //kitapta örnek 7.2 , f(x)=(x^3)-13x-12 ve kökler {-3,-1,4}
    public static double function(double x) {
        return Math.pow(x, 3) - 13 * x - 12;
    }
}