package OnlineCourses.BasicExample;

public class loopsDonguler {    //9. ders döngüler (for döngüsü,break,continue)
    public static void main(String[] args) {

        for (int i = 4; i <= 10; i = i + 3) {
            System.out.println("i= " + i);
        }

        for (int i = 5, j = 20; i < 9 || j > 15; i++, j = j - 2) {     //veya da iki değerden bir doğruysa işlemi yapar
            System.out.print("i= " + i);
            System.out.println(", j= " + j);
        }

        for (int i = 0; i < 5; i++) {
            int num = i / 2 * 2;  //tam sayı bölmesi olduğu için i tek ise i/2 bize (i-1)/2 yi verir ve 2 ile çarpınca i-1 olur
            if (num == i) {
                System.out.println("i= " + i + " çift");
                continue;   //anlamı : nerde olursan ol for döngüsünün başına git
            }
            System.out.println("i= " + i + " tek"); //burası for un scope unun içinde if in scope unun dışında!!!
        }

        for (int i = 1; i < 20; i++) {
            System.out.println(i);
            if (i % 7 == 0)
                break;//anlamı : for düngüsünü bitir
        }
    }
}
