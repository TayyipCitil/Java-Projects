package Algorithms.Uygulama.Hafta11;

public class Sinav_str_ile {
    public static void main(String[] args) {
        int binary=10111;
        int decimal=0;
        String strBinary=binary+"";
        for(int i=0;i<strBinary.length();i++){
            if('1'==strBinary.charAt(strBinary.length()-1-i)){
                decimal+=(int)Math.pow(2,i);
            }
        }
        System.out.println(decimal);
    }

}
