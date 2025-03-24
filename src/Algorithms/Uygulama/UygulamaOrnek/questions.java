package Algorithms.Uygulama.UygulamaOrnek;

import java.util.Locale;

public class questions {
    public static void main(String[] args) {
        //1.
        int num = (int) (Math.random()*100+1);
        System.out.println(num);
        if (num%2==0){
            System.out.println("Çift");
        } else{
            System.out.println("Tek");
        }

        //2.
        int num1 = (int)(Math.random()*101-50);
        System.out.println(num1);
        if (num1<0){
            System.out.println("negative");
        } else if (num1==0) {
            System.out.println("zero");
        }else{
            System.out.println("positive");
        }

        //3.
        int a =4;
        if (a%2==0){
            System.out.println(Math.pow(a,2));
        }else {
            System.out.println(Math.pow(a,3));
        }

        //4.
        int vizeNot=59,finalNot=76,NN =vizeNot*40/100+finalNot*60/100;
        System.out.println(NN);
        if(NN<50){
            System.out.println("DD");
        }else if(NN<65){
            System.out.println("CC");
        }else if (NN<80){
            System.out.println("BB");
        } else if (NN<=100){
            System.out.println("AA");
        }

        //5.
        String text1="cUmHuriYet",text2="cumhuriyet";
        if(text1.toLowerCase().equals(text2.toLowerCase())){
            System.out.println("These values are same");
        }else {
            System.out.println("These values aren\'t same");
        }

        //6.
        char islem = '-';
        int n1= (int)(Math.random()*100+1),n2=(int)(Math.random()*100+1);
        switch (islem){
            case '+':
                System.out.println(n1+" + "+n2+" = "+(n1+n2));//(n1-n2) parantez içinde yoksa string birleştime yapıyor önce soldaki "+" çalışıyor
                break;
            case '-':
                System.out.println(n1+" - "+n2+" = "+ (n1-n2));//(n1-n2) parantez içinde çünki sistem "+" mı "-" mi operatörünü çalıştıracağını bilemedi
                break;
            case '/':
                System.out.println(n1+" / "+n2+" = "+(double)n1/n2);
                break;
            case '*':
                System.out.println(n1+" * "+n2+" = "+n1*n2);
                break;
        }

        //Ödev 1.yol
        int sayi=231;
        System.out.println(Math.pow(sayi/100,2)+Math.pow((sayi%100)/10,2)+Math.pow(sayi%10,2));
    }
}
