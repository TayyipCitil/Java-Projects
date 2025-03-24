package ObjectOrientedProgramming.Hafta4;

public class OgrenciTest {
    public static void main(String[] args) {
        Ogrenci ogrenci_1 = new Ogrenci();
        Ogrenci ogrenci_2 = new Ogrenci("Fatma", "Bilgisayar Müh");
        Ogrenci ogrenci_3 = new Ogrenci("Ayşe", "Makine Müh");
        Ogrenci ogrenci_4 = new Ogrenci("Elif", "Elektrik-Elektronik Müh", 1.98, "2020");
        //Ogrenci ogrenci_5=new Ogrenci("Davut","Elektrik-Elektronik Müh",-567,"2022");

        System.out.println("Öğrencilerin Bilgileri");
        System.out.println("OGR-1 "+ogrenci_1.getAd() + " " + ogrenci_1.getBolum() + " " + ogrenci_1.ogrenciNoOlustur() + " " + ogrenci_1.getGano());
        System.out.println("OGR-2 "+ogrenci_2.getAd() + " " + ogrenci_2.getBolum() + " " + ogrenci_2.ogrenciNoOlustur() + " " + ogrenci_2.getGano());
        System.out.println("OGR-3 "+ogrenci_3.getAd() + " " + ogrenci_3.getBolum() + " " + ogrenci_3.ogrenciNoOlustur() + " " + ogrenci_3.getGano());
        System.out.println("OGR-4 "+ogrenci_4.getAd() + " " + ogrenci_4.getBolum() + " " + ogrenci_4.ogrenciNoOlustur() + " " + ogrenci_4.getGano());
        //5. Öğrencide negatif değeri test edelim
        //System.out.println("OGR-5 "+ogrenci_5.getAd()+" "+ogrenci_5.getBolum()+" "+ogrenci_5.ogrenciNoOlustur()+" "+ogrenci_5.getGano());

        //3.Öğrencinin harç hesaplaması uzatma yılı yok
        System.out.println("3. öğrencinin ödeyeceği harc: "+ogrenci_3.harcHesapla(4));

        //4.Öğrenci okulu uzattığı için daha fazla harç ödeyecek
        System.out.println("4. Öğrencinin ödeyeceği harç: "+ogrenci_4.harcHesapla(4, 2));
    }
}
