package OnlineCourses.BasicExample;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodOverloading { //18.ders Method lar ve overloading
    public static void main(String[] args) {//method ismindeki "void" parametre göndermeyen/vermiyen method anlamına gelir
        //methodlarımız main methodun scope unun dışında açılır
        //modhod larımızın açılış sırası değil main mothod daki sırası önemlidir

        //parametre almayan ve parametre vermeyen method
        giris();

        //parametre almayan ve parametre veren method
        System.out.println(dunya());

        ArrayList<Integer> dizi = new ArrayList<>(Arrays.asList(3, 5, 8, 2, 1));
        //parametre alan ve parametre vermeyen method
        diziYaz(dizi); //dizimizi diziYaz mothoduna gönderdik


        //parametre alan ve parametre veren method
        System.out.println(diziToplam(dizi)); //dizimizi diziToplam mothoduna gönderdik


        /*overloading aynı isme sahip ancak farklı parametre listelerine sahip birden
        fazla metodun tanımlanabilmesine olanak tanıyan bir özelliktir.*/
        MethodOverloading example = new MethodOverloading();  /*Bu satır, methodsOverloading sınıfının  aynı isimdeki
        metodlarına erişim sağlamak ve bu metodları kullanmak için gerekli bir adımdır.Yani example nesnesi üzerinden
        toplama metodlarını çağırabiliriz.*/
        int sonuc1 =example.toplama(2, 3);
        double sonuc2 =example.toplama(2.5, 3.5);
        String sonuc3 =example.toplama("Merhaba", "Dünya");

        System.out.println("Toplama Sonucu 1: " + sonuc1);
        System.out.println("Toplama Sonucu 2: " + sonuc2);
        System.out.println("Toplama Sonucu 3: " + sonuc3);
    }

    private static void giris() { //parametre almayan ve parametre vermeyen method
        //method adındaki "void" parametre göndermeyen/vermiyen method anlamına gelir
        System.out.println("Merhaba");

    }

    private static String dunya() {//parametre almayan ve parametre veren method
        //gönderdiğimiz parametre
        String mesaj = "Dünya";
        return mesaj; //mesaj değişkenini main methoda gönderdik
    }

    private static void diziYaz(ArrayList<Integer> dizi) {//parametre alan ve parametre vermeyen method
        //method ismindeki "void" parametre göndermeyen/vermiyen method anlamına gelir
        System.out.println(dizi);
    }

    private static int diziToplam(ArrayList<Integer> dizi) {//parametre alan ve parametre veren method
        int toplam = 0;
        for (int i = 0; i < dizi.size(); i++) {
            toplam = toplam + dizi.get(i);
        }
        return toplam; //toplam parametresini main methoda gönderdik

    }


    //Overloading
    // Metodun ilk versiyonu (int türde parametreler)
    public int toplama(int a, int b) {
        return a + b;
    }

    // Metodun ikinci versiyonu (double türde parametreler)
    public double toplama(double a, double b) {
        return a + b;
    }

    // Metodun üçüncü versiyonu (string türde parametreler)
    public String toplama(String a, String b) {
        return a + b;
    }
}