package OnlineCourses.MathExample;

public class mathMethods {
    public static void main(String[] args) {
        int x = 5, y=3;

        //Math.abs() mutlak değer
        System.out.println(Math.abs(-4));
        System.out.println(Math.abs(4.5));
        System.out.println(Math.abs(-1.3));

        //Math.floor
        System.out.println(Math.floor(4.3));
        System.out.println(Math.floor(-4.9));
        System.out.println(Math.floor(4.5));

        //Math.log10(x)
        System.out.println(Math.log10(100));
        System.out.println((Math.log10(0.1)));

        //Math.pow(x,y)
        System.out.println(Math.pow(2,3));
        System.out.println(Math.pow(10,-1));

        //Math.sqrt(x)
        System.out.println(Math.sqrt(121));

        //Math.max(x,y)
        //Math.min(x,y)
        System.out.println(Math.max(12,34));
        System.out.println(Math.min(-12,5));

        //Math.random(x)
        double num1;
        int num2, num3;

        num1= Math.random();
        num2 = (int)(Math.random()*101); // 0 to 100
        num3 = (int)(Math.random()*6+1); // 1 to 6

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

    }

}

