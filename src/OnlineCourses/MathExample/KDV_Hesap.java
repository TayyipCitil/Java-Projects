package OnlineCourses.MathExample;

import java.util.Scanner;

public class KDV_Hesap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Fiyat: ");
        double fiyat=input.nextDouble();
        double oran=fiyat<1000 ? 0.18:0.8; //KDV oranı %18 veya %8
        double kdvTutari=fiyat*oran;
        System.out.println("Fiyat:"+fiyat);
        System.out.println("KDV Oranı"+oran);
        System.out.println("KDV Tutarı:"+kdvTutari);
        System.out.println("KDV'li Fiyat:"+(fiyat+kdvTutari));

    }
}
