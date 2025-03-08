package Algorithms.Arrays;

public class StringElemanHarfleri {
    public static void main(String[] args) {

        // Dizinin ikinci elemanının harflerini bulma

        String[] dizi = {"Ahmet", "Mehmet"};
        for (int i = 0; i < dizi[0].length(); i++) {
            System.out.println(dizi[0].charAt(i));
        }

    }
}
