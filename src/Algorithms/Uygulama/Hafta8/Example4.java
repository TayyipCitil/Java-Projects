package Algorithms.Uygulama.Hafta8;

public class Example4 {
    public static void main(String[] args) {
        int vize=100, fin=93;
        double ort = vize*0.4+fin*0.6;
        System.out.println("Ortalama: " + ort);

        if(0<=ort && ort<50)
            System.out.println("Harf Notunuz DD");
        else if (50<=ort && ort<65)
            System.out.println("Harf notunuz CC");
        else if(65<=ort && ort<80)
            System.out.println("Harf notunuz BB");
        else
            System.out.println("Harf notunuz AA");
    }
}
