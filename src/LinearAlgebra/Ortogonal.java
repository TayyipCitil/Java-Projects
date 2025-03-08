package LinearAlgebra;
public class Ortogonal {
    public static void main(String[] args) {
        int[] u = {1, 0, 4, 5};
        int[] v = {0, 4, -5, 4};
        isOrtogonal(u, v);

    }

    static void isOrtogonal(int[] u, int[] v) {
        if (u.length != v.length) {
            System.out.println("Boyutları farklı.Ortogonal Değil");
        } else {//boyutlar aynıysa
            if(dot(u,v)==0){
                System.out.println("Ortogonaldir");
            }else{
                System.out.println("Ortogonal Değildir");
            }

        }
    }
    static int dot(int[] u, int[] v) {
        int sum = 0;
        for (int i = 0; i < u.length; i++) {
            sum += u[i] * v[i];
        }
        return sum;
    }
}
