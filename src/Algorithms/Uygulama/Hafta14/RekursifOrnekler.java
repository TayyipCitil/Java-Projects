package Algorithms.Uygulama.Hafta14;

public class RekursifOrnekler {
    public static void main(String[] args) {
        System.out.println(f(5));
        System.out.println(toplam(5));
        System.out.println(aralikToplam(5,8));
        System.out.println(rekursifUst(2,5));
        hello(5);
        nYaz(10);
        System.out.println();
        nCiftYaz(100);
    }

    // Rekursif faktor
    public static int f (int n){
        // Base statement: Temel durum
        if(n==1)
            return 1;
        // Recursive statement: Yineleme durumu
        else return n*f(n-1);
    }
    // 1'den n'e kadar olan sayıların toplamını hesaplayan rekursif metot
    public static int toplam(int n){
        if(n==1)
            return 1;
        else
            return n + toplam(n-1);
    }

    // Belirtilen aralıktaki sayıların toplamını hesaplayan rekursif metot
    public static int aralikToplam(int alt, int ust){
        if(alt == ust)
            return ust;
        else
            return alt + aralikToplam(alt+1,ust);
            // return ust + aralikToplam(alt,ust-1);
    }

    // Math.pow metodunu rekursif yazın
    public static int rekursifUst(int alt, int ust){
        if(ust==0)
            return 1;
        else return alt*rekursifUst(alt,ust-1);
    }

    // ekrana n adet hello yazan rekursif metot
    public static void hello(int n){
        if(n!=0){
            System.out.println("Hello");
            hello(n-1);
        }
    }

    // 1'den n'e kadar olan sayıları ekrana rekursif yazan metot
    public static void nYaz(int n){
        if(n!=0){
            nYaz(n-1);
            System.out.print(n+ " ");
        }
    }

    // 1'den n'e kadar olan çift sayılar
    public static void nCiftYaz(int n){
        if(n!=0){
            nCiftYaz(n-1);
            if(n%2==0)
            System.out.print(n+ " ");
        }
    }
}
