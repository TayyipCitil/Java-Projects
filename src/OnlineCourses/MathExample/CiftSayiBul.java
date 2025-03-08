package OnlineCourses.MathExample;

import java.util.Scanner;

public class CiftSayiBul {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı gir: ");
        //2 ye tam bölünenler
        int sayi=input.nextInt(),i=0;
        for(i=0;i<=sayi;i++){
            if (i%2!=0) continue; //continue kullanmak istedim o sebeple != kullandım
            System.out.print(i+",");
        }
        System.out.println("");
        //3 ve 4 e tam bölünenlerin ortalaması
        int ort=0,sayac=-1;//sayaç 0'ı saymasın diye -1 dedik
        for (i=0;i<=sayi;i++){
            if (i%3==0&&i%4==0){
                ort+=i;
                sayac++;
            }
        }
        ort=ort/sayac;
        System.out.println(ort);
    }
}
