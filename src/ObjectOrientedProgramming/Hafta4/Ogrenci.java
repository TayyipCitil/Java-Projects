package ObjectOrientedProgramming.Hafta4;

public class Ogrenci {
    private String ad;
    private String bolum;
    private String girisyili;
    private String ogrNo;
    private double gano;
    private static final int bolumKodu=123;
    //static final int bolumKodu=123;
    private static int count=0;

    //1. Constructor hiç bir parametre almamış
    public Ogrenci() {
        this(null, null, 0, "1973");

    }
    //2. Constructor sadece ad ve bolum parametrelerini aldı
    public Ogrenci(String ad, String bolum) {
        this(ad, bolum,0, "1985");

    }

    //3. Constructor ad,bolum parametrelerini aldı
    public Ogrenci(String ad, String bolum, double gano, String girisyili) {
        //negatif değer için kontrol yapıyoruz
        if (gano < 0||gano>4) {
            throw new IllegalArgumentException("Gano negatif veya 4'ten büyük bir değer olamaz");
        }

        this.ad = ad;
        this.bolum = bolum;
        this.gano = gano;
        this.girisyili=girisyili;

        //count değişkenini buraya yazınca tüm öğrenciler için aynı anda sayacı artırıyor.
        //Yani tüm öğrencilerin ogrNo değeri 20204 oluyor
        //count++;
    }

    // this parametresi ile başka bir constructor metodu olan 4. constructor'ın çağrılması
    public Ogrenci(Ogrenci ogrenci) {
        this(ogrenci.ad, ogrenci.bolum, ogrenci.gano, ogrenci.girisyili);

    }
    //Öğrenci Numarasının oluşturulması
    public String ogrenciNoOlustur()
    {
        count++;
        if (count < 10) {
            ogrNo=(String.valueOf(girisyili)+String.valueOf(bolumKodu)+"00"+String.valueOf(count));
        }
        else if (count < 100) {
             ogrNo=(String.valueOf(girisyili)+String.valueOf(bolumKodu)+"0"+String.valueOf(count));
        }
        else {
             ogrNo=(String.valueOf(girisyili)+String.valueOf(bolumKodu)+String.valueOf(count));
        }

        return ogrNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("Gano negatif veya 4'ten büyük bir değer olamaz");
        }
        this.gano = gano;
    }

    //1.harcHesapla Metodunda Öğrencinin uzatma yılı yok

    public double harcHesapla(int dersSayisi) {
        double harc = dersSayisi * 120;
        return harc;
    }

    //2. harcHesapla Metodunda öğrencinin uzatma yılı var daha fazla harç ödeyecek
    public double harcHesapla(int dersSayisi, double uzatmaYili) {
        double harc=dersSayisi*120*uzatmaYili;
        return harc;
    }
}
