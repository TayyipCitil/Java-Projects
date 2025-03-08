package Algorithms.Hafta11;

public class Ornek5 {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 6;
        int max = n2;
        int min = n1;
        if (n1 > n2) {
            max = n1;
            min = n2;
        }
        //Ebob
        int ebob = min;
        for (int i = min; 1 <= i; i--) {
            if (max % i == 0 && min % i == 0) {
                ebob = i;
                break;
            }
        }
        System.out.println(ebob);
        //ekok
        int ekok=max;
        for(int i=max;i<=max*min;i+=max){
            if(i%min==0){
                ekok=i;
            }
        }
        System.out.println(ekok);

    }
}
