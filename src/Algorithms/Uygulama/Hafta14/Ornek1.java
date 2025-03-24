package Algorithms.Uygulama.Hafta14;

public class Ornek1 {
    public static void main(String[] args) {
        System.out.println(ciftMi(21));
    }
    public static boolean ciftMi(int n){
        while(n>0){
            if((n%10)%2!=0)
                return false;
        n=n/10;
        }
       return true;
    }
}
