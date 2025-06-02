package ObjectOrientedProgramming.Week15;

public class SiparisKontrol {
    public static void siparisKontrolEt(String name, int siparisAdedi) {
        if (name.trim().isEmpty()) throw new IllegalArgumentException("Kullanıcı Adı Boş Olamaz");

        if (siparisAdedi < 0) throw new NegativeArraySizeException("Sipariş Adedi Negatif Olamaz");

        if (siparisAdedi > 100) throw new TooMuchOrderException("100 adetten fazla sipariş verilemez");

    }
}
