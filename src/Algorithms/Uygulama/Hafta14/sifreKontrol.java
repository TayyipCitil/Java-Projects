package Algorithms.Uygulama.Hafta14;/* Kullanıcının girdiği bir şifrenin geçerli olup olmadığını aşağıdaki
kurallara göre belirleyen bir metot yazarak, kullanıcıdan alınan şifrelerin
geçerli olup olmadığını kontrol eden program.
1- Şifre en az 8 karakterden oluşmalıdır.
2- Şifre yalnızca harf ve rakamlardan oluşmalıdır.
3- Şifre en az 2 adet rakam ve 1 adet harf içermelidir.
 */

import java.util.Scanner;

public class sifreKontrol {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Şifre giriniz: ");
        String sifre = giris.nextLine();
        if (gecerliMi(sifre))
            System.out.println("Geçerli şifre");
        else
            System.out.println("Geçersiz şifre");


    }

    public static boolean gecerliMi(String sifre){
        if (sifre.length()<8) return false;
        int harfSayisi=0, RakamSayisi=0;
        for (int i = 0; i < sifre.length(); i++) {
            char ch = sifre.charAt(i);
            if (harfMi(ch)) harfSayisi++;
            else if (sayiMi(ch)) RakamSayisi++;
            else return false;
        }

        if(harfSayisi <1 || RakamSayisi<2) return false;
        else return true;
    }

    public static boolean sayiMi (char c){
        return (c>='0' && c<='9');
        // return (c>=48 && c<=57);
    }

    public static boolean harfMi(char c){
        c = Character.toUpperCase(c);
        if(c>='A' && c<='Z') return true;
        else return false;
    }
}
