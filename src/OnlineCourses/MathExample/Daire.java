package OnlineCourses.MathExample;

import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //MatematikselOrnekler.Daire Alan
        double PI = 3.14;
        System.out.print("Dairenin yarıçapını cm cinsinden gir: ");
        double r = input.nextDouble(), area, perimeter, angle;
        area = PI * r * r;
        System.out.println("Alan: " + area);

        //MatematikselOrnekler.Daire Çevre
        perimeter = 2 * PI * r;
        System.out.println("Çevre: " + perimeter);

        //MatematikselOrnekler.Daire Diliminin Alanı
        System.out.print("MatematikselOrnekler.Daire dilimiyse açıyı derece cinsinden gir: ");
        angle = input.nextDouble();
        area = PI * r * r * (angle / 360);
        System.out.println("MatematikselOrnekler.Daire diliminin alanaı: " + area);
    }
}
