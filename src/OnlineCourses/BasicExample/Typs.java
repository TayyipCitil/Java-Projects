package OnlineCourses.BasicExample;

public class Typs { //14. ders -Tip dönüşümleri
    public static void main(String[] args) {

        //int to double
        int i = 4;
        double d = i;
        System.out.println("dbl i = " + d);

        //double to int
        double a = 3.41;
        int b = (int) a;
        System.out.println("int a = " + b);

        //any type of number to string
        String num1 = String.valueOf(a);
        String num2 = String.valueOf(i);
        System.out.println("string a and i = " + num1 + " and " + num2);

        //Not: string+int=string

        //string to int
        String num3 = "124";
        int k;
        k = Integer.valueOf(num3);
        System.out.println(k / 2);

        //part of string to int
        String time = "12:24:50";
        int h = Integer.valueOf(time.substring(0, 2));
        int m = Integer.valueOf(time.substring(3, 5));
        int s = Integer.valueOf(time.substring(6, 8));
        System.out.print("hour= " + h);
        System.out.print(", minute= " + m);
        System.out.println(", second= " + s);


        //örnek= üsteki zamanda saati değiştir değişken değiştirme ile
        h=1;

        if(h<10) {
            String h2 =String.valueOf(h);
            h2="0"+h2;
            time = h2 + time.substring(2);
            System.out.println(time);
        }else System.out.println(time);
    }
}
