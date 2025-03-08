package OnlineCourses.ClassExample.MyMathClass;

public class MyMathClass {


    static int abss(int num) {//abs() taklit
        if (num < 0) {
            num = -num;
        }
        return num;
    }

    static double abss(double num) {
        if (num < 0) {
            num = -num;
        }
        return num;
    }

    static double flooor(double num) {
        int floor;
        if (num < 0) {
            if (num == (int) num) {
                floor = (int) num;
            } else {
                floor = ((int) num) - 1;
            }
        } else {
            floor = (int) num;
        }
        return floor;
    }

    static double ceill(double num) {
        int ceil;
        if (num > 0) {
            if (num == (int) num) {
                ceil = ((int) num);
            } else {
                ceil = ((int) num) + 1;
            }
        } else {
            ceil = ((int) num);
        }
        return ceil;
    }

    static int roundd(double num) {
        int round;
        if (num >= 0) {//num pozitif
            if ((int) num != (int) (num + 0.5)) { //ondalıklı kısım 0.5 den büyük veya eşit
                round = (int) num + 1;
            } else {
                round = (int) num;
            }
        } else {//num negatif
            if ((int) num != (int) (num - 0.5)) { //ondalıklı kısım 0.5 den büyük veya eşit
                if (num + 0.5 == (int) num) {
                    round = (int) num;
                } else {
                    round = (int) num - 1;
                }
            } else {
                round = (int) num;

            }

        }
        return round;
    }


}
