package Algorithms.Hafta14;

public class AsalMi {
    public static void main(String[] args) {
        // aldığı sayının asal olup olmadığını kontrol eden metot
        System.out.println(asalMi(29));
        System.out.println(asalMi(12));
    }
    static boolean asalMi(int x){
        boolean asalMi=true;
        for (int i = 2; i <= x/2; i++) {
            if(x%i==0){
                asalMi=false;
                break;
            }
        }
        return asalMi;
    }
}
