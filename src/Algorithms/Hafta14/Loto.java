package Algorithms.Hafta14;

import java.util.Arrays;

public class Loto {
    public static void main(String[] args) {
        // 0-5 (dahil) arasında 5 haneli bir piyango sayısına göre:
        // ilk 2 hane tutarsa: amorti- 50 tl
        // ilk 3 hane tutarsa: teselli - 1000 tl
        // ilk 4 hane tutarsa: idare eder - 10.000 tl
        // hepsi tutarsa: büyük piyango - 50.000
        int[] piyangoNumaralari = new int[5];
        for (int i = 0; i < piyangoNumaralari.length; i++) {
            piyangoNumaralari[i] = (int) (Math.random()*6);
        }
        System.out.println("Şanslı Numaralar: " + Arrays.toString(piyangoNumaralari));
        int[] tayyip = {1,2,3,4,5};
        int[] sefa = {1,3,2,4,5};
        int[] salih = {1,3,2,4,5};
        int[] kumru = {5,3,2,4,1};
        int[] mesut = {5,2,3,1,4};
        int[] emre = {4,0,2,0,1};
        System.out.println("Tayyibin şansı: " + BiletDeger(piyangoNumaralari,tayyip));
        System.out.println("Sefa şansı: "  + BiletDeger(piyangoNumaralari,sefa));
        System.out.println("Salih şansı: "  + BiletDeger(piyangoNumaralari,salih));
        System.out.println("Kumru şansı: "  + BiletDeger(piyangoNumaralari,kumru));
        System.out.println("Mesut şansı: "  + BiletDeger(piyangoNumaralari,mesut));
        System.out.println("Emre şansı: "  + BiletDeger(piyangoNumaralari,emre));

    }

    static int BiletDeger (int[] orjinal, int[] dizi){
        int tutmaSayisi = 0;
        for (int i = 0; i < orjinal.length; i++) {
            if(orjinal[i]==dizi[i])
                tutmaSayisi++;
            else break;
        }
        switch (tutmaSayisi){
            case 1: return 5;
            case 2: return 50;
            case 3: return 1000;
            case 4: return 10000;
            case 5: return 50000;
            default: return 0;
        }
    }

}
