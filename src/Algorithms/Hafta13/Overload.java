package Algorithms.Hafta13;

public class Overload {
    public static void main(String[] args) {
        int x = toplam(5,23,2);
        int y = toplam(4,'c');
        int z = toplam(3,4);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);



    }
    public static int toplam (int sayi1, int sayi2){
        return sayi1*sayi2;
    }

    public static int toplam (int sayi1, char sayi2){
        return sayi1*sayi2;
    }

    public static int toplam (char sayi1, int sayi2){
        return sayi1*sayi2;
    }

    public static int toplam(int sayi1, int sayi2, int sayi3){
        return sayi1+sayi2+sayi3;
    }
}
