package OnlineCourses.ClassExample.comparison;

public class trueFalse {
    public static void main(String[] args) {
        int saat = 22;
        if (saat < 10) {
            System.out.println("good morning");//koşulun yanlış olması durumunda yeni bir koşul varsa "else if" kullanılır
        } else if (saat<18) {
            System.out.println("good days");//bir koşulunun yanlış olması durumunda yürütülrcek kod
        } else {
            System.out.println("good evening");
        }

        // ?: operatörü if...else ile aynı işi yapar
        String resault= (saat<18) ? "iyi günler" : "iyi akşamlar";
        System.out.println(resault);


        //switch çok sayıda if else yazmak yerine kullanılır
        int day=4;
        switch (day){
            case 1://case=durum dan sonra iki nokta üstüste kullanılıyor
                System.out.println("Pazartesi");
                break;// break anahtar kelimesi bizi switch bloğundan çıkartır
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");

        }
        switch (day){
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Hafta sonunu iple çekiyorum");
        }
    }
}