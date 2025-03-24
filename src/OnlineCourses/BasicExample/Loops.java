package OnlineCourses.BasicExample;

public class Loops { //  10. ders ("while" döngüsü ve "do-while" döngüsü)
    public static void main(String[] args) {


        //for daki hali
        for(int a=0;a<5;a++){
            System.out.print(" a="+a );
        }
        System.out.println(" A = "); //+ a eklersek çalışmaz çünki a yı döngünün içinde tanımladık

        //while daki hali
        int b=0;
        while(b<5){
            System.out.print(" b="+b );
            b++;
        }
        System.out.println(" B ="+b );

        //do-while daki hali
        int c=0;
        do{
            System.out.print(" c="+c );  //do-while önce yazdırır sonra şartımızı sorar
            c++;
        }while (c<5);    //şartımız sağlanıyorsa do ya geri döner sağlanmıyorsa while çıktısını verir döngüyü tamamlar
        System.out.print(" C="+c );

    }
}
