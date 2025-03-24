package OnlineCourses.BasicExample;

public class Scopes { //8. ders Scope{bloklar/kapsama alanı "{}"}
    int num3=10;// burayı static yapmanın yolu "static int num3;" yazmak
    static int num4=6;//num4 ün tüm scope larda başlangıç değeri 6 olur
    public static void main(String[] args) {

        int num1 =11; //if in scope unun dışında bir değişken tanımladık

        if (num1>10){
            //int num1=4;//bir üst scope da tanımlanan bir değişken alt scope larda tekrar tanımlanmaz
            int num2=5; //if in scope unun içnde bir değişken tanımladık
            num4=10; // num4 sadece bu scope un içinde 10 olur
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num4);
        }
            System.out.println(num1);//11
            //System.out.println(num2);//num2 sadece if scope un içinde tanımlı
            //System.out.println(num3);//static olmayan bir değişken static olan scope içinde çalışmaz
            System.out.println(num4);//6
    }
}
