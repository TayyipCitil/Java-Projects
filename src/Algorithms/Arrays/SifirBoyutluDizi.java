package Algorithms.Arrays;
import java.util.Arrays;
public class SifirBoyutluDizi {
    public static void main(String[] args) {// b ve c dizileri 0 elemanlı
        double[] a={1,2,3};
        double[] b = Arrays.copyOfRange(a,2,2);
        double[] c=new double[0];
        System.out.println(b[0]);
        System.out.println(c[0]);
    }
}
