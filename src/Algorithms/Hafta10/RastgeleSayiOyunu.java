package Algorithms.Hafta10;

public class RastgeleSayiOyunu {
    public static void main(String[] args) {
        int sayi = (int) (Math.random()*100+1);
        System.out.println("Gerçek sayi: " + sayi);
        int min=0, max=100;
        int tahminSayisi=0;
        boolean kontrol=false;
        while (kontrol==false){
            int tahmin = (int) (Math.random()*(max-min)+min);
            tahminSayisi++;
            System.out.println("Üretilen sayi: "+tahmin);
            if(tahmin>sayi)
                max=tahmin-1;
            else if(tahmin<sayi)
                min=tahmin+1;
            else
                kontrol=true;
        }
        System.out.println(tahminSayisi + ". tahminde bulundu");
    }
}
