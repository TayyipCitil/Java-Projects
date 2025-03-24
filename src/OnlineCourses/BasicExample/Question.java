package OnlineCourses.BasicExample;

public class Question {
    public static void main(String[] args) {

        //1.
        System.out.println("Merhaba");
        System.out.println("Tayyip");

        String hi = "Mehaba";
        String name =  "Tayyip";
        System.out.println(hi);
        System.out.println(name);

        //2.
        System.out.println(-5+8*6);
        System.out.println((55+9)%9);
        System.out.println(20-3*5/8);
        System.out.println(5+15/3*2-8%3);

        //3.
        int a = 42;
        int b = 7;
        int sum= a+b, multiplication=a*b, divide=a/b, subtract=a-b;
        System.out.println("Bu iki sayının toplamı = " +sum);
        System.out.println("Bu iki sayının farkı = " +subtract);
        System.out.println("Bu iki sayının çarpımı = " +multiplication);
        System.out.println("Bu iki sayının oranı = " +divide);

        //4.
        int vizeNot=40,finalNot=60;
        double ortalamaNot=vizeNot*40/100+finalNot*60/100d;
        System.out.println(ortalamaNot);

        //5.
        int r = 5;
        final double pi =3.14;
        double area =pi*r*r,circumference=2*pi*r;
        System.out.println(area);
        System.out.println(circumference);

        //6.
        float sayi1 =42.423f;
        int sayi2 = (int) sayi1;
        System.out.println(sayi2);

    }
}

