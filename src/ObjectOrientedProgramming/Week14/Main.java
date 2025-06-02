package ObjectOrientedProgramming.Week14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Metni gir: ");
        String orjinal=scanner.nextLine();
        StringBuilder sb=new StringBuilder();
        sb.append(orjinal);


        for (int i = 0; i < sb.length(); i++) {
            char c=sb.charAt(i);
            if(Character.isUpperCase(c)){
                sb.setCharAt(i,Character.toLowerCase(c));
            }
        }
        System.out.println("Orjinal hal: "+orjinal);
        System.out.println("Küçük harfe çevrilmiş hal: "+sb);

        int[] harfTekrar=new int[26];//ingiliz alfabesi 26 harf

        for (int i = 0; i < sb.length(); i++) {
            char c=sb.charAt(i);
            harfTekrar[c-'a']++;
        }
        int enCok=0;
        char enCokHarf='a';
        for (int i = 0; i < harfTekrar.length; i++) {
            if(harfTekrar[i]>enCok){
                enCok=harfTekrar[i];
                enCokHarf=(char)(i+'a');
            }
        }
        System.out.println("en çok tekrar eden harf: "+ enCokHarf);
        System.out.println("tekrar sayısı: "+enCok);


    }
}
