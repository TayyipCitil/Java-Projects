package Algorithms.UygulamaOrnek;

public class Ornek11 {
    public static void main(String[] args) {
        String str1="KRALMESUT";
        String str2="KralMesut";
        if((str1.toLowerCase()).equals(str2.toLowerCase()))//equalsIgnoreCase() ile büyük küçük göz ardı edilir
            System.out.println("Metinler aynı"); //if else else-if de tek satır işlem varsa süslü paranteze gerk yok
        else
            System.out.println("Metinler farklı");

    }
}
