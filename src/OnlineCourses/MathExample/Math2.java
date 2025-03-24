package OnlineCourses.MathExample;

public class Math2 { //12.ders math
    public static void main(String[] args) {
        double num=3.6;
        //"round" en yakın tam sayıya yuvarlar
        System.out.println(Math.round(num));

        for (int i=1;i<=3;i++) {
            int r = (int) (Math.random() * 100+1);
            System.out.println(i+". sayımız= "+r+" dir.");
        }
    }
}
