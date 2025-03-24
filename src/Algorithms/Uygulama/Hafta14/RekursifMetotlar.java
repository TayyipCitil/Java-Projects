package Algorithms.Uygulama.Hafta14;

public class RekursifMetotlar {
    public static void main(String[] args) {
     //   System.out.println(faktor(5));
       // System.out.println(Toplam(5));
       // System.out.println(aralikToplam(6,10));
       // System.out.println(usAlma(2,5));
       // merhaba(5);
        //nKereYazdir(5);
        //System.out.println();
        //nKereTerstenYazdir(5);
        nCiftYazdirma(100);

    }
    // Rekursif faktor
    public static int faktor(int n){
        // Base statement
        if(n==1)
            return 1;
        // Rekursif statement
        else return n*faktor(n-1);
    }

    // Rekursif 1'den n'e kadar olan sayılar toplamı
    public static int Toplam(int n){
        if (n==1)
            return 1;
        else
            return n + Toplam(n-1);
    }

    // Belirtilen aralıktaki sayıların toplamını hesaplayan metot
    public static int aralikToplam (int alt, int ust){
        if(alt==ust)
            return alt;
        else
            return ust + aralikToplam(alt,ust-1);
           // return alt + aralikToplam(alt+1,ust);
    }

    // pow metodunu rekürsif yapan metot
    public static int usAlma (int alt, int ust){
        if (ust==1)
            return alt;
        else
            return alt * usAlma(alt,ust-1);
    }

    // Ekrana n defa merhaba yazdıran metot
    public static void merhaba (int n){
        if(n!=0){
            System.out.println("Merhaba");
            merhaba(n-1);
        }
    }

    // 1'den n'e kadar olan sayıların ekrana yazdırılması
    public static void nKereYazdir (int n){
        if(n!=0){
            nKereYazdir(n-1);
            System.out.print(n+ " ");
        }
    }

    // 1'den n'e kadar olan sayıların ekrana yazdırılması
    public static void nKereTerstenYazdir (int n){
        if(n!=0){
            System.out.print(n+ " ");
            nKereTerstenYazdir(n-1);
        }
    }

    // 1'den n'e kadar çift sayıların ekrana yazdırılması
    public static void nCiftYazdirma(int n){
        if(n!=0){
            nCiftYazdirma(n-1);
            if(n%2==0)
                System.out.print(n+ " ");
        }
    }
}
