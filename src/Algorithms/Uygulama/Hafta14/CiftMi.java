package Algorithms.Uygulama.Hafta14;/* İçerisine parametre olarak aldığı bir tamsayının her basamağının
çift olup olmadığını kontrol eden ciftMi isminde bir metot tasarlayınız.
Eğer tüm basamak değerleri çift ise true, bir tanesi bile tek ise false
döndermelidir
 */

import java.util.Scanner;

public class CiftMi {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Sayıyı gir");
        int a = giris.nextInt();
        if (ciftMi(a))
            System.out.println("Tüm basamaklar çifttir");
        else
            System.out.println("Tüm basamaklar tektir.");
    }

    public static boolean ciftMi(int n){
        while (n!=0){
            if((n%10)%2 != 0)
                return false;
            n = n/10;
        }
        return true;
    }
}
