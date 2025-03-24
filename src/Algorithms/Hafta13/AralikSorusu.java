package Algorithms.Hafta13;

import java.util.Arrays;

public class AralikSorusu {
    /* Rastgele oluşturulan 10 elemanlı dizi içerisindeki
       ardışık sayılar arasındaki en büyük ve en küçük aralıkları
       bulup; oluşturulan diziyi, en büyük aralık ve bu aralığın indislerini
       en küçük aralık ve bu aralığın indislerini yazdıran program.
     */
    public static void main(String[] args) {
        int[] dizi = new int[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random()*50+1);
        }
        int buyukDeger=Math.abs(dizi[1]-dizi[0]), buyukidx=0,kucukDeger=Math.abs(dizi[1]-dizi[0]),kucukidx=0;
        for (int i = 0; i < dizi.length-1; i++) {
            int aralik = Math.abs(dizi[i]-dizi[i+1]);
            if(aralik>buyukDeger) {
                buyukDeger = aralik;
                buyukidx=i;
            }
            if(aralik<kucukDeger){
                kucukDeger=aralik;
                kucukidx=i;
            }
        }

        System.out.println(Arrays.toString(dizi));
        System.out.println("Max Aralık: "+buyukDeger + " İndisler: "+ (buyukidx+1)+","+(buyukidx+2));
        System.out.println("Min Aralık: "+kucukDeger + " İndisler: "+ (kucukidx+1)+","+(kucukidx+2));


    }
}
