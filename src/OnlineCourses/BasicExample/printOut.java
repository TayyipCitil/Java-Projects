package OnlineCourses.BasicExample;

public class printOut { //15. ders print out formatting
    public static void main(String[] args) {

        int n = 145300;
        //print  :aynı satıra yazdırır
        System.out.print("1)"+ n);

        //println  :yazdırdıktan sonra bir alt satıra geçer
        System.out.println("        2)" + n);

        //printf  integer için:
        System.out.printf("%100d \n",n);
        /*printf içerisindeki  "%__d" ifadesinde ½ ve d arasına yazdığımız sayı değişkenimizin son terimi
        ile satır başına kadar olan mesafadir tamamlamak için boşluk ekler
        eğer araya virgül koyarsak basamakları virgüller ile ayırır*/
        System.out.printf("%,10d \n",n);


        //printf double için:
        double i =23.0/7;
        System.out.printf(" %50.10f \n",i);
        /* değişken double ise "%__.__f" kullanılır .ilk sayı
        önde ne kadar boşluk istedğimizi ikinci sayı virgülden sonra kaç basamak devam etmesini
        istediğimizi ifade eder*/

        //printf string için:
        String text="merhaba";
        System.out.printf("%10s",text);
    }
}