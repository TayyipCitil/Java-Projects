package Algorithms.Hafta12;

import java.util.ArrayList;
import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        /*Bir karakter dizisindeki harfleri ve bu harflerin kaç defa
         geçtiklerini bulup iki ayrı arrayList de saklıyan algoritma
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kelime: ");
        String kelime = scanner.nextLine();
        ArrayList<Character> harfler = new ArrayList<Character>();
        ArrayList<Integer> adet =new ArrayList<Integer>();
        for (int i = 0; i < kelime.length(); i++) {
            if (!harfler.contains(kelime.charAt(i))) {
                harfler.add(kelime.charAt(i));
                adet.add(1);
            }else{
                int index=harfler.indexOf(kelime.charAt(i));
                adet.set(index,(harfler.get(index)+1));
            }
            /*for(int j=0;j<i;j++){
                if(harfler.get(i)==harfler.get(j)){
                    harfler.remove(i);
                }
            }*/
        }
        System.out.println(harfler);
        System.out.println(adet);
    }
}
