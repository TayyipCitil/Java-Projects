package OnlineCourses.MathExample;

public class AsalSayi {
    public static void main(String[] args) {
        // 1 ve 100 arasındaki asal sayıları yazan program

        for(int i=2;i<=100;i++){
            int sayac=0; // sayacı her seferinde sıfırlamamız gerekiyor
            for(int k=2;k<=i/2;k++){
                if(i%k==0){
                    sayac++;
                }
            }
            if(sayac==0){
                System.out.print(i+",");
            }
        }
    }
}
