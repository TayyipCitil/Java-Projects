package OnlineCourses.BasicExample;

public class Sum {
    public static void main(String[] args) {

        int x =5;
        int y =8;
        System.out.println(x+y);
        // sayısal değerler için + operatorü toplama yapar, string ifadeler için birlerştime yapar

        int a = 6, b = 4, c = 45;
        //aynı tipteki herbir değişkeni ayrı ayrı bildirmeye gerk yoktur "," ile ayırarak yazabilriz
        System.out.println(a+b-c);

        int k,l,m;
        k = l = m = 90;
        //birden fazla değişkene aynı değeri atıyabiliriz

        //Data genişlemesi,daha küçük boyutlu tipin daha büyük boyutluya geçirilmesi sırasında otomatik olur
        int myInt = 9;
        double myDouble = myInt; // otomatik atama: int to double

        System.out.println(myInt);
        System.out.println(myDouble);


        //Data daralması,daha büyük boyutlu tipin daha küçük boyutluya geçirilmesi manuel olur.
        double myDouble2 = 7.22d;
        int myInt2 = (int) myDouble2; //manuel atama:double to int

        System.out.println(myDouble2);
        System.out.println(myInt2);

    }
}
