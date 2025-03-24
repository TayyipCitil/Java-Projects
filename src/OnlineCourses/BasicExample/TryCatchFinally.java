package OnlineCourses.BasicExample;

import java.util.Scanner;

public class TryCatchFinally { //19. ders try catch finally
    public static void main(String[] args) {

        /*try bloğu içinde, hata potansiyeli taşıyan bir kod parçasını tanımlarız.
        Bu blok içindeki kodun çalışması sırasında bir hata oluşmazsa try scope u çalışır,
        bir hata oluşursa catch scope una geçer ve o çalışır. İksii aynı anda çalışmaz*/

        System.out.print("Bir sayı giriniz =");
        Scanner n = new Scanner(System.in);

        try { int num = n.nextInt();  //girilen değer int değilse hata verir
            System.out.println("sayi= "+ num);
        }catch (Exception e){
            System.out.println("error= " +e);
            System.out.println("hatalı giriş");
        }finally {//try ya da catch hangisi çalışırsa çalışsın finnaly daima çalışır
            System.out.println("program sonlandı");
        }
    }
}
