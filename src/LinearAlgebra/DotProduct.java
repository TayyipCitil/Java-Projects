package LinearAlgebra;
public class DotProduct {
    public static void main(String[] args) {
        int[] u = {1, 2, 3, 4, 5};
        int[] v = {1, 1, 1, 1, 1};

        if (u.length != v.length) {
            System.out.println("bu vektörler çarpılamaz");
        } else {
            int resault = 0;
            for (int i = 0; i < u.length; i++) {
                resault += u[i] * v[i];
            }
            System.out.println("sonuç: " + resault);
        }
    }
}
