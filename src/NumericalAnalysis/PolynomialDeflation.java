package NumericalAnalysis;
//
import java.util.Arrays;
import java.util.Scanner;
//
public class PolynomialDeflation {//derece düşürme,  örnek 6.9'daki fonksiyonu kullanabilirsin x^3-5x^2+7x-3
    public static double[] diziA, kokler;
    public static int n;
    public static boolean isImejiner = false;//son iki kökü diskriminant ile buluyoruz eğer kokler imejinerse bu değişkeni kullanıcaz
//
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("derece(n): ");
            n = scanner.nextInt();
            diziA = new double[n + 1];//n.dereceden bir polinomun n+1 tane terimi var
            for (int i = n; i >= 0; i--) {
                System.out.print(i + ". katsayı: ");
                double katsayi = scanner.nextDouble();
                diziA[i] = katsayi;
            }
//
            System.out.print("n_eps: ");
            int n_eps = scanner.nextInt();
            System.out.print("x_0: ");
            double x_0 = scanner.nextDouble();
            System.out.print("δx_0: ");
            double smallDeltaX_0 = scanner.nextDouble();
            System.out.print("iMax: ");
            int iMax = scanner.nextInt();
//
            kokler = new double[n];//n.dereceden bir polinomun n tane kökü var
            for (int i = kokler.length - 1; 0 <= i; i--) {//2 <=i çünkü son 2 kökü diskriminant ile bulucaz
                if (i >= 2) {
                    kokler[i] = yuvarla(modifiedSecantMothod(diziA, x_0, smallDeltaX_0, iMax, n_eps), 2);
                    dereceDusurme(kokler[i]);//Not: diziA static olduğu için parametre olarak almaya gerek yok
                } else {
                    diskriminantIleKokBul(diziA[2], diziA[1], diziA[0]);
                }
            }
            printRoots();
//
            System.out.print("Tekrar denemek ister misiniz(e/h)? ");
            scanner.nextLine();
            String secim = scanner.nextLine();
            if (!secim.equals("e")) {
                break;
            }
            isImejiner=false;//diğer static olanlar yeniden deniyince döngü içinde güncelleniyor ama bu güncellenmiyordu o yüzden eklendi
        }
    }
//
    public static void dereceDusurme(double t) {// t: bildiğimiz kök,  Not: diziA static olduğu için parametre olarak almaya gerek yok
        double[] diziB = new double[n + 1];//n.dereceden bir polinomun n+1 tane terimi var
        diziB[n] = 0;
        diziB[n - 1] = diziA[n];
        for (int i = n; i >= 2; i--) {
            diziB[i - 2] = diziA[i - 1] + diziB[i - 1] * t;
        }
        diziA = Arrays.copyOf(diziB, diziB.length);//(parametre olan diziA yı kaldırdık)Eğer böyle yaparsak parametre olan diziA artık diziB'yi referans gösteriri ama asıl diziA'da bir değişiklik olmaz
        /*for (int i = n; i >= 0; i--) {//Parametre olan diziA, orjinal diziA yı referans gösterir ve diziA'da bir değişiklik olur
            diziA[i] = diziB[i];
        }*/
        n--;
    }
//
    public static double modifiedSecantMothod(double[] diziA, double x_i, double smallDeltaX_i, int iMax, int n_eps) {// δ=smallDelta
        int iter = 0;
        double ea = 0, es = 0.5 * Math.pow(10, 2 - n_eps), nextX = 0, nextSmallDeltaX; // nextX = x_i+1 , nextSmallDeltaX = smallDeltaX_i+1
        do {
            if (x_i == 0.0) {//eğer 0 olursa δx= infinity olur
                x_i = 1e-4;//10^-4
            }
            try {
                nextX = x_i - ((functionUpdate(diziA, x_i) * smallDeltaX_i) / (functionUpdate(diziA, x_i + smallDeltaX_i) - functionUpdate(diziA, x_i)));
                nextSmallDeltaX = nextX * (smallDeltaX_i / x_i);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                break;
            }
            if (nextX != 0) {
                ea = Math.abs((nextX - x_i) / nextX) * 100;
            }
            if (ea < es || iter >= iMax) {
                break;
            }
            iter++;
            x_i = nextX;
            smallDeltaX_i = nextSmallDeltaX;
        } while (true);
        return nextX;
    }
//
    public static void diskriminantIleKokBul(double a, double b, double c) {
        double diskriminant = b * b - 4 * a * c;
        if (diskriminant > 0) {
            kokler[1] = yuvarla((-b + Math.sqrt(diskriminant)) / (2 * a), 2);
            kokler[0] = yuvarla((-b - Math.sqrt(diskriminant)) / (2 * a), 2);
        } else if (diskriminant == 0) {
            kokler[1] = yuvarla(-b / (2 * a), 2);
            kokler[0] = kokler[1];
        } else {
            isImejiner = true;
            kokler[1] = yuvarla(-b / (2 * a), 2);//reel kısmı kokler dizisinin 1. elemanına gönderiyorum
            kokler[0] = yuvarla(Math.sqrt(-diskriminant) / (2 * a), 2);//imejiner kısım kokler dizisinin 0. elemanına gönderiyorum (yazdırmada kolaylık olsun diye)
        }
    }
//
    public static double functionUpdate(double[] diziA, double x) {//her derece duşuruldüğünde fonksiyon değiştiği için kullanılan fonksiyon
        double f = 0;
        for (int i = diziA.length - 1; i >= 0; i--) {
            f += diziA[i] * Math.pow(x, i);
        }
        return f;
    }
//
    public static double yuvarla(double sayi, int basamak) {
        double kat = Math.pow(10, basamak);
        return Math.round(sayi * kat) / kat;
    }
//
    public static void printRoots() {//kokler static olduğu için parametre olarak almaya gerek yok
        System.out.print("Kökler = { ");
        double[] koklerSirali;
        double reelKisim = 0, imejinerKisim = 0;
        if (isImejiner) {
            reelKisim = kokler[1];
            imejinerKisim = kokler[0];
            koklerSirali = Arrays.copyOfRange(kokler, 2, kokler.length); // [2,kokler.lenght) yarı açık aralığı ve eğer kok sayısı 2 ve hepsi imejiner ise bu dizi 0 boyutlu olur
        } else {
            koklerSirali = Arrays.copyOf(kokler, kokler.length);//isim aynı olsun for döngüsü 2 kez yazılmasın diye işlem aynı
        }
        Arrays.sort(koklerSirali);
        for (int i = 0; i < koklerSirali.length; i++) {
            int count = 0;
            for (double eleman : koklerSirali) {
                if (koklerSirali[i] == eleman) {
                    count++;
                }
            }
            if (i == 0) {//ilk elemandan önce eleman yok
                System.out.print(koklerSirali[i] + ", ");
            } else {//i>0
                if (koklerSirali[i] != koklerSirali[i - 1]) {
                    System.out.print(koklerSirali[i] + ", ");
                } else if (i != koklerSirali.length - 1) {//son elemandan sonra eleman yok
                    if (koklerSirali[i] != koklerSirali[i + 1]){
                        System.out.print("\b\b (" + count + " katlı kök)" + ", ");
                    }
                }else {//i son eleman ve bir önceki ile eşit
                    System.out.print("\b\b (" + count + " katlı kök)" + ", ");
                }
            }
        }
        if (isImejiner) {
            imejinerKisim = Math.abs(imejinerKisim);
            System.out.print(reelKisim + "+" + imejinerKisim + "i, " + reelKisim + "-" + imejinerKisim + "i  ");
        }
        System.out.print("\b\b }\n");
    }
//
}