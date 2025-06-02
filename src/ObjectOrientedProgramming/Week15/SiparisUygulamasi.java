package ObjectOrientedProgramming.Week15;

import java.util.Scanner;

public class SiparisUygulamasi {
    public static String name;
    public static int siparisAdedi;
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kullanıcı Adı: ");
        name=scanner.nextLine();
        System.out.print("Sipariş Adedi: ");
        siparisAdedi=scanner.nextInt();
        try {
            SiparisKontrol.siparisKontrolEt(name,siparisAdedi);
        }catch (Exception e){
            System.out.println("!!!Hata: "+e.getMessage());
        }finally {
            System.out.println("Uygulama Sonlandı");
        }
    }
}
