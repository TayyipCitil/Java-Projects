package Algorithms.Uygulama.Hafta14;

public class EbobEkok {
    public static void main(String[] args) {
        // Parametre olarak aldığı iki sayının ebobunu ve ekokunu hesaplayıp
        // geri döndüren iki metot tasarlayın.
        int x = 10, y=12;
        System.out.println("Ebobları: " + ebob(x,y));
        System.out.println("Ekokları: " + ekok(x,y));
    }
    public static int ebob(int a, int b){
        int min = Math.min(a,b);
        int ebob=min;
        for (int i = min; i >=1 ; i--) {
            if(a%i==0 && b%i==0) {
                ebob = i;
                break;
            }
        }
        return ebob;
    }

    public static int ekok (int a, int b){
        int max = Math.max(a,b);
        int ekok=max;
        for (int i = max; i <= a*b; i+=max) {
            if(i%a==0 && i%b==0){
                ekok=i;
                break;
            }
        }
        return ekok;
    }

    static int ebob2(int a, int b){
        return (a*b)/ekok(a,b);
    }

    static int ekok2(int a, int b){
        return (a*b)/ebob(a,b);
    }

}
