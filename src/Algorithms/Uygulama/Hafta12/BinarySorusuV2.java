package Algorithms.Uygulama.Hafta12;

public class BinarySorusuV2 {
    public static void main(String[] args) {
        String sayi = "1001";
        int toplam = 0;
        for (int i = 0; i < sayi.length(); i++) {
            char basamak = sayi.charAt(sayi.length()-1-i);
            String a = Character.toString(basamak);
            int b = Integer.parseInt(a);
            toplam += Math.pow(2,i)*b;
        }
        System.out.println(toplam);
    }
}
