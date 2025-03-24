package Algorithms.Uygulama.Hafta14;

public class rekursifDevam {
    static int basamakToplam=0;
    public static void main(String[] args) {
       // System.out.println(rekursifCiftToplam(10));
       // System.out.println(basamaklarinToplami(5671123));
       // String a = "Cumhuriyet";
     //   System.out.println(a.substring(3));
       // System.out.println(a.substring(3,6));
        // System.out.println(terstenYazilis("Cumhuriyet"));
       // System.out.println(terstenSayiYazdirma(123456));
       // System.out.println(asalMi(47,2));
       // System.out.println(asalMi(50,2));
       // int sayi = 47;
       // System.out.println(asalMiv2(sayi,sayi-1));
      //  tamBolenler(72,1);
        int[] dizi = {3, 5, 6, 7};
        System.out.println(diziOrt(dizi,dizi.length-1));

    }

    // 1'den n'e kadar olan çift sayıların toplamını rekursif
    // olarak hesaplayan metot
    public static int rekursifCiftToplam(int n){
        if(n==2)
            return 2;
        else if (n%2==0)
            return n + rekursifCiftToplam(n-2);
        else
            return rekursifCiftToplam(n-1);
    }

    // İçerisine parametre aldığı herhangi bir sayının basamak değerlerinin
    // toplamını rekursif olarak hesaplayan metod
    public static int basamaklarinToplami(int sayi){
        int kalan = sayi%10;
        if(sayi>0){
            basamakToplam+=kalan;
            return basamaklarinToplami(sayi/10);
        }
        else
            return basamakToplam;
    }

    // İçerisine parametre olarak aldığı String bir ifadeyi
    // ters çeviren rekursif metot
    public static String terstenYazilis (String metin){
        if(metin.isEmpty())
            return metin;
        else
        {
            char ch = metin.charAt(0);
            return terstenYazilis(metin.substring(1))+ch;
        }
    }

    // İçerisine parametre olarak aldığı bir sayıyı tersten
    // yazdıran rekursif metot
    public static int terstenSayiYazdirma(int sayi){
        if(sayi<10){
            // System.out.print(sayi);
            return sayi;
        }
        else
        {
            int birler = sayi%10;
            System.out.print(birler);
            return terstenSayiYazdirma(sayi/10);
        }
    }

    // İçerisine parametre olarak aldığı bir sayının asal olup olmadığını
    // rekursif olarak bulan metot
    public static boolean asalMi(int sayi, int i){
        if(sayi==2)
            return true;
        if(sayi%i==0)
            return false;
        if(i>sayi/2)
            return true;

        return asalMi(sayi, i+1);

    }

    public static boolean asalMiv2(int sayi, int i){
        if(sayi==2)
            return true;
        if(sayi%i==0)
            return false;
        if(i<sayi/2)
            return true;

        return asalMi(sayi, i-1);
    }

    // İçerisine parametre olarak aldığı bir sayının tam bölenlerini
    // bulan rekursif metot
    public static void tamBolenler (int sayi, int i){
        if(i<=sayi){
            if(sayi%i==0)
                System.out.print(i + " ");
            tamBolenler(sayi,i+1);
        }
    }

    // İçerisine aldığı bir dizinin elemanlarının ortalamasını hesaplayan
    // rekursif metot
    public static double diziOrt(int[] dizi, int n){
        double sonuc = 0;
        sonuc = (double) dizi[n] / (double) dizi.length;
        if(n==0)
            return sonuc;
        else
            return sonuc + diziOrt(dizi,n-1);

    }
}
