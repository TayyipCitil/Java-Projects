package Algorithms.UygulamaOrnek;

public class Deneme {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            System.out.print(i + ",");
        }
        System.out.println("\n" + "----------------------------------------");//String
        String str = "Tayyip";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.concat("-----"));
        System.out.println(str.toUpperCase());
        System.out.println("bunu içeriyor mu ? " + str.contains("s"));
        System.out.println("hangi konumda ? " + str.indexOf("Ta"));
        System.out.println("son harfi bu mu ? " + str.endsWith("p"));
        System.out.println("eşit mi ? " + str.equals("tayyip"));
        System.out.println("eşit mi ? " + str.equalsIgnoreCase("tayyip"));
        System.out.println("boş mu ? " + str.isEmpty());
        //System.out.println("boşluk mu ? "+str.isBlank());
        System.out.println(str.replace("y", "b"));
        System.out.println("--------------------------------------------");//Math
        int num=-12;
        System.out.println((int) (Math.random() * 3));//[0,3) aralığı
        System.out.println((int) (Math.random() * 10 - 5));//[-5,5) aralığı
        System.out.println(Math.abs(-9));
        System.out.println(Math.ceil(12.1));
        System.out.println(Math.floor(12.9));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.max(56,78));
        System.out.println("----------------------------------------------");//if else
        if(num>5){
            System.out.println("böyük :]=");
        }else{
            System.out.println("küçük veya eşit");
        }
        char c=10000;
        System.out.println(c);
        int n1='✐';
        System.out.println(n1);
        float f1=9223372036854775807L;
        double d1=9223372036854775807L;
        System.out.println(f1);
        System.out.println(d1);
        char c1 = 65;
        long l1 = 100000000000000L;
        System.out.println(l1);
        System.out.println(c1);
        int i;
        for(i=0;i<5;i++){ //döngü değişkenini dışarda tanımladık bu sahede dışarda kullanabildik
            System.out.println(i);
        }
        System.out.println(i+" son");
    }
}
