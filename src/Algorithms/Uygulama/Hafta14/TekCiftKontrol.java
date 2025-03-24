package Algorithms.Uygulama.Hafta14;

public class TekCiftKontrol {
    public static void main(String[] args) {
        // aldığı sayının tek mi çift mi olduğunu kontrol eden iki ayrı metot
        System.out.println(tekMi(11));
    }
    static boolean tekMi(int x){
        if(x%2==0)
            return false;
        else return true;
        // return (x%2==1);
    }

    static boolean ciftMi(int x){
        return (x%2==0);
    }
}
