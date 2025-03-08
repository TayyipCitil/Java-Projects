package ObjectOrientedProgramming.Hafta4.Uygulama;

public class Main {
    public static void main(String[] args) {
        Arac arac1=new Arac("Fiat","Uno",1997,150000);
        System.out.println(arac1.bilgileriGoster());
        Musteri musteri1=new Musteri("Tayyip","Çitil",100000,arac1);
        System.out.println(musteri1.bilgileriGoster());
        musteri1.bakiyeYeterMi();
        System.out.println("-----------------------------------------------------------");
        arac1.setFiyat(100000);
        System.out.println(arac1.bilgileriGoster());
        musteri1.bakiyeYeterMi();
        System.out.println("-----------------------------------------------------------");
        Arac arac2=new Arac("Reno","Clio",2001,300000);
        System.out.println(arac2.bilgileriGoster());
        Musteri musteri2=new Musteri("Mesut","Karslıoğlu",3500000,arac1);
        System.out.println(musteri2.bilgileriGoster());
        musteri2.bakiyeYeterMi();
        System.out.println("-----------------------------------------------------------");
        Arac arac3=new Arac("Toyota","Corola",2001);
        System.out.println(arac3.bilgileriGoster());
        Musteri musteri3=new Musteri("Fırat","Yelkuvan",9000000,arac1);
        System.out.println(musteri3.bilgileriGoster());
        musteri3.bakiyeYeterMi();
    }
}
