package Algorithms.Hafta15;

public class Uygulama2 {
    public static void main(String[] args) {
        System.out.println(asalMi(2,2));
        System.out.println(asalMi(3,2));
        System.out.println(asalMi(5,2));
        System.out.println(asalMi(7,2));
        System.out.println(asalMi(11,2));
        System.out.println(asalMi(13,2));
        System.out.println(asalMi(4,2));
        System.out.println(asalMi(6,2));
        System.out.println(asalMi(8,2));
        System.out.println(asalMi(10,2));
    }

    static boolean asalMi(int sayi, int i) {
        if (sayi > 1) {
            if (i <= sayi/2) {
                return !(sayi % i == 0);
            } else {
                return (!(sayi % i == 0)) || asalMi(sayi, i + 1);
            }
        } else {
            return false;
        }
    }

    static boolean asalMi2(int sayi, int i) {
        if (sayi <= 1) {
         return false;
        }
        if (sayi%i==0){
            return false;
        }
        if (i>=sayi/2){
            return true;
        }
        return asalMi2(sayi,i+1);
    }

}
