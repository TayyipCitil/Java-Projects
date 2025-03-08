package Algorithms.Hafta14;

public class TersString {
    public static void main(String[] args) {
        // Aldığ string ifadeyi ters çevirip geri dönderen metot
        String isim = "Sivas cumhuriyet üniversitesi";
        System.out.println(tersMetin(isim));
    }

    static String tersMetin(String metin){
        String tersMetin = "";
        for (int i = metin.length()-1; i >=0 ; i--) {
            tersMetin = tersMetin+metin.charAt(i);
        }
        return tersMetin;
    }
}
