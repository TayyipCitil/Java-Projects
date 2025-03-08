package ObjectOrientedProgramming.Hafta4.Uygulama;

public class Arac {
    private int yil;
    private String model;
    private String marka;
    private double fiyat;

    public Arac(String model, String marka, int yil, double fiyat) {
        this.yil = yil;
        this.model = model;
        this.marka = marka;
        this.fiyat = fiyat;
    }

    public Arac(String model, String marka, int yil) {
        this.yil = yil;
        this.model = model;
        this.marka = marka;
    }

    public String bilgileriGoster() {
        return "Arac{" +
                ", model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", fiyat=" + fiyat +
                " yil=" + yil +
                '}';
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
        System.out.println("Fiayat güncellendi ");
    }
}
