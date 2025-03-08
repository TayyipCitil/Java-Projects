package Algorithms.Hafta15;

import java.util.Arrays;

public class Ornek2 {
    public static void main(String[] args) {
        int[] dizi={1,2,3,4,5};
        System.out.println(toplama(dizi));
    }

    static int toplama(int[] dizi){
        if(dizi.length==1){
            return dizi[dizi.length-1];
        }else
            return dizi[dizi.length-1]+toplama(Arrays.copyOf(dizi,dizi.length-1));
    }
}
