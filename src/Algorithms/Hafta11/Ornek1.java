package Algorithms.Hafta11;

public class Ornek1 {
    public static void main(String[] args) {
        String str="Tayyip";
        String ters="";
        int uzunluk=str.length();
        for (int i=uzunluk-1;0<=i;i--){
            char c=str.charAt(i);
            ters=ters.concat(Character.toString(c));
            //ters=ters+str.charAt(i);
        }
        System.out.println(ters);
    }
}
