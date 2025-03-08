package OnlineCourses.ClassExample.MyMathClass;

public class Main {
    public static void main(String[] args) {

        //abs()
        System.out.println(MyMathClass.abss(-45));
        System.out.println(MyMathClass.abss(15));
        System.out.println(MyMathClass.abss(1.15));
        System.out.println(MyMathClass.abss(-0.15));
        System.out.println("==============");
        //floor()
        System.out.println(MyMathClass.flooor(-2.4));
        System.out.println(MyMathClass.flooor(-2));
        System.out.println(MyMathClass.flooor(12));
        System.out.println(MyMathClass.flooor(12.5));
        System.out.println("==============");
        //ceil()
        System.out.println(MyMathClass.ceill(-2));
        System.out.println(MyMathClass.ceill(-0.12));
        System.out.println(MyMathClass.ceill(12));
        System.out.println(MyMathClass.ceill(12.45));
        System.out.println("===============");
        //round()
        System.out.println(MyMathClass.roundd(-1.5));
        System.out.println(MyMathClass.roundd(-0.49));
        System.out.println(MyMathClass.roundd(-0.55));
        System.out.println(MyMathClass.roundd(12.5));
        System.out.println(MyMathClass.roundd(12.51));
        System.out.println(MyMathClass.roundd(12.49));

    }
}
