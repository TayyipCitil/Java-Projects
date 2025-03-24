package ObjectOrientedProgramming.Labs.Lab3;

public enum Color {
    KIRMIZI("Yakut Kırmızısı", 0),
    SARI("Civciv Sarısı", 1),
    MAVI("Gökyüzü Mavisi", 2),
    YESIL("Su Yeşili", 3),
    BEYAZ("İnci Beyazı", 4);

    private String avatar;
    private int renkKod;

    Color(String avatar, int renkKod) {
        this.avatar = avatar;
        this.renkKod = renkKod;
    }

    public String getAvatar() {
        return avatar;
    }

    public int getRenkKod() {
        return renkKod;
    }
}

