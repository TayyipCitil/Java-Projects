package Algorithms.Hafta12;

import java.util.Arrays;
public class Ornek1 {
    /*Rasgele elemanlı bir dizinin ardaşık elemanları arası en büyük ve en
    küçük uzaklığı ve bu uzaklığa sahip elemanların indislerini yazan algoritma
     */
    public static void main(String[] args) {
        int[] dizi = new int[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 50 + 1);
        }
        System.out.println(Arrays.toString(dizi));
        int max = Math.abs(dizi[0] - dizi[1]);
        int maxIndex=0;
        int min = Math.abs(dizi[0] - dizi[1]);
        int minIndex=0;
        for (int i = 0; i < dizi.length - 1; i++) {
            if (max < Math.abs(dizi[i] - dizi[i + 1])) {
                max = Math.abs(dizi[i] - dizi[i + 1]);
                maxIndex=i;
            } else if (min > Math.abs(dizi[i] - dizi[i + 1])) {
                min = Math.abs(dizi[i] - dizi[i + 1]);
                minIndex=i;
            }
        }
        System.out.println("max fark: "+max + ", min fark: " + min);
        System.out.println("max fark index: "+maxIndex+","+(maxIndex+1)+ ", min fark index: "+minIndex+","+(minIndex+1));
    }
}