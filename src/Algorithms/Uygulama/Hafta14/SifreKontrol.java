package Algorithms.Uygulama.Hafta14;

import java.util.Scanner;

/* Kullanıcının girdiği bir şifrenin geçerli olup olmadığını aşağıdaki
kurallara göre belirleyen metot:
1- Şifre en az 8 karakterden oluşmalıdır.
2- Şifre yalnızca harf ve rakamlardan oluşmalıdır.
3- Şifre en az 2 adet rakam ve 1 adet harf içermelidir.
 */
public class SifreKontrol {
    public static int sifreUzunluk=8;

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Lütfen şifreyi giriniz: ");
        String sifre = giris.nextLine();
        if(gecerliMi(sifre))
            System.out.println("Geçerlidir");
        else
            System.out.println("Geçersizdir!!!");
    }
    public static boolean gecerliMi (String sifre){
        if(sifre.length() < sifreUzunluk) return false;
        int harfSayac = 0, sayiSayac=0;
        for (int i = 0; i < sifre.length(); i++) {
            char c = sifre.charAt(i);
            if(harfMi(c)) harfSayac++;
            else if (sayiMi(c)) sayiSayac++;
            else return false;
        }
        if(sayiSayac<2 || harfSayac<1) return false;
        else return true;
    }

    public static boolean sayiMi (char ch){
        return (ch>='0' && ch<='9');
        // return (ch>=48 && ch<=57);
    }
    public static boolean harfMi(char ch){
        ch = Character.toUpperCase(ch);
        return (ch>='A' && ch <='Z');
       // return (ch>=65 && ch<=90);
    }

}
