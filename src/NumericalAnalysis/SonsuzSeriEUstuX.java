package NumericalAnalysis;

public class SonsuzSeriEUstuX {
    public static void main(String[] args) {
        //eUstuX(10,20); //20. iterasyondan sonra sayılar saçmalamaya başlıyor
        eUstXVerimli(-10,50);
    }
    public static void eUstXVerimli(double x,int iMax){//her bir terim öncekinden türetilecek böylece daha az işlem ve daha az hata olucak
//e^-x=1/e^x olduğundan ve e^-x alınca sonuca salınımlı yaklaştığımızdan dolayı x i pozitif alıp en son 1/e^x yapıcaz
        boolean xNegative=x<0;
        x=Math.abs(x);
        int i=0;//hangi terimde olduğumuzu söyler
        double term=1;//0. terim 1 olduğu için x^0/0!=1
        double sum=0,oldSum,eA,es=0.5*Math.pow(10,2-8);//terimeler toplamı yani sonucumuz
        System.out.printf("%-10s%-30s%s%n","i","sum","eA(%)");
        System.out.printf("%-10d%-20.8f%n", i,sum);
//
        while (true){
            i++;
            term=term*x/i;
            oldSum=sum;
            sum+=term;
            eA=Math.abs((sum-oldSum)/sum)*100;
            System.out.printf("%-10d%-,30.8f%.8f%n",i,xNegative?1/sum:sum,eA);
            if (i>iMax || eA<es) break;
        }
    }
//verimsiz yöntem alttaki
    public static void eUstuX(double x,int iMax){ //e^x seri açılımı
        int iter=0;
        double sum=1,oldSum,eA,es=0.5*Math.pow(10,2-6);
        System.out.printf("%-10s%-30s%s%n","İter","Sonuc","eA(%)");
        System.out.printf("%-10d%-20f%n",iter,sum);
        while (true){
            iter++;
            oldSum=sum;
            sum+=Math.pow(x,iter)/factorial(iter);
            eA=Math.abs((sum-oldSum)/sum)*100;
            System.out.printf("%-10d%-,30f%f%n",iter,sum,eA);
            if (iter>=iMax || eA<es) break;
        }
    }
//
    public static long factorial(int n){
        return n==1||n==0?1:n*factorial(n-1);
    }
}
