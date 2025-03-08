package OnlineCourses.MathExample;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double elma=3.67,armut=2.14,domates=1.11,muz=0.95,patlican=5,total;
        System.out.print("Kaç kilo elma: ");
        elma *=input.nextDouble();
        System.out.print("Kaç kilo armut: ");
        armut *= input.nextDouble();
        System.out.print("Kaç kilo domates: ");
        domates *= input.nextDouble();
        System.out.print("Kaç kilo muz: ");
        muz *= input.nextDouble();
        System.out.print("Kaç kilo patlıcan: ");
        patlican *= input.nextDouble();
        total=elma+armut+domates+muz+patlican;
        System.out.println("Toplam Fiyat : "+total);
    }
}
