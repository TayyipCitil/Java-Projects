package ObjectOrientedProgramming.Hafta4.Ders;

public class Time1 {
    private int hour;
    private int minute;
    private int secend;

    public void setTime(int hour, int minute, int secend) {
        //validation (kontrol ettik)
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || secend < 0 || secend >= 60) {
            throw new IllegalArgumentException(" " + "Hatalı değer");
        }
        this.hour = hour;
        this.minute = minute;
        this.secend = secend;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, secend);
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, secend, (hour < 12 ? "AM" : "PM"));
    }

}
