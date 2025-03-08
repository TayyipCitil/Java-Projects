package ObjectOrientedProgramming.Hafta4.Uygulama;

public class Musteri {
    private Arac arac;
    private String isim;
    private String soyad;
    private double bakiye;

    public Musteri(String isim,String soyad, double bakiye,Arac arac) {
        this.arac = arac;
        this.isim = isim;
        this.bakiye = bakiye;
        this.soyad = soyad;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public void bakiyeYeterMi() {
        if(this.bakiye<arac.getFiyat()){
            System.out.println("Bakiyeniz "+(arac.getFiyat()-this.bakiye)+"TL yetersiz :(");
        }else
            System.out.println("Bakiyeniz Yeterli :)");
    }

    public String bilgileriGoster() {
        return "Musteri{" +
                " isim='" + isim + '\'' +
                ", soyad='" + soyad + '\'' +
                ", bakiye=" + bakiye +
                '}';
    }
}
