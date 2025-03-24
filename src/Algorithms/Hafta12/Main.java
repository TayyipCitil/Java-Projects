package Algorithms.Hafta12;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Bubble sort ile dizi sıralama:
        int[] dizi = {32,25,15,3,5,67,4,7};
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 1; j < dizi.length-i ; j++) {
                if (dizi[j-1]>dizi[j]){
                    int temp=dizi[j-1];
                    dizi[j-1]=dizi[j];
                    dizi[j]=temp;
                }
            }
        }
       /* for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]+ " ");
        }*/
        // Arrays.sort(dizi);
        // System.out.println(Arrays.toString(dizi));
        // int[] dizi = {32,25,15,3,5,67,4,7};
		
		//Diziyi tekrardan sıralama işlemi: 
        /*for (int i = 0; i < dizi.length/2; i++) {
            int temp = dizi[i];
            dizi[i]=dizi[dizi.length-i-1];
            dizi[dizi.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(dizi));*/
		
		//Dizinin belirli bir indisindeki elemanın silinmesi:

      /*  int[] dizi = {32,25,15,3,5,67,4,7};
        int indis = 3;
        for (int i = indis; i < dizi.length-1 ; i++) {
            dizi[i]=dizi[i+1];
        }
        System.out.println(Arrays.toString(dizi));*/
		
		//Dizide tekrarlayan elemanların bulunma işlemi:

       /* int[] dizi = {4,6,2,4,7,12,6,17,7};
        System.out.print("Tekrarlayan elemanlar: ");
        for (int i = 0; i < dizi.length-1; i++) {
            for (int j = i+1; j < dizi.length ; j++) {
                if (dizi[i] == dizi[j]) {
                    System.out.print(dizi[i]+" ");
                }
            }
        }*/
		
		//Çok boyutlu diziler: 
		
       /* int[][] dizi = {{1,5,3,4},{12,32,2},{5,67},{90}};
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j]+" ");
            }
            System.out.println();
        }*/

        /*ilkMetodum();
        ilkMetodum();
        ilkMetodum();*/
        /*System.out.println(arttirma(5));
        System.out.println(arttirma(3));*/
       /* System.out.println(toplama(5,6));
        System.out.println(toplama(1,3));*/
        int[] dizi1={1,2,3,4,5,6,7};
        int[] dizi2={20,4,6,8};
/*        System.out.println(diziOrt(dizi1));
        System.out.println(diziOrt(dizi2));*/
        System.out.println(diziKucuk(dizi1));
        System.out.println(diziKucuk(dizi2));
        String a="sivas cumhuriyet üniversitesi";
        String b="mÖlItya";
        System.out.println(sesliHarfSayisi(a));
        System.out.println(sesliHarfSayisi(b));

    }

    static void ilkMetodum(){
        System.out.println("Merhaba Dünya");
    }

    static int arttirma(int x){
        return x+5;
    }
    static int toplama(int x, int y){
        return x+y;
    }

    static double diziOrt(int[] x){
        double toplam =0;
        for (int i = 0; i < x.length; i++) {
            toplam=toplam+x[i];
        }
        return toplam/x.length;
    }
    static int diziKucuk(int[] dizi){
        int enKucuk=dizi[0];
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i]<enKucuk){
                enKucuk=dizi[i];
            }
        }
        return enKucuk;
    }
    static int sesliHarfSayisi(String x){
        String metin = x.toLowerCase();
        int sayac = 0;
        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i)=='a' || metin.charAt(i)=='e' || metin.charAt(i)=='i'|| metin.charAt(i)=='ı'|| metin.charAt(i)=='ö'|| metin.charAt(i)=='o'|| metin.charAt(i)=='u'|| metin.charAt(i)=='ü'){
                sayac++;
            }
        }
        return sayac;
    }
}
