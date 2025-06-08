package NumericalAnalysis.homeWork;

import java.util.Scanner;

public class FalsePositionHesap {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Alt deger:");
        double xa=scanner.nextDouble();
        System.out.print("Ust deger:");
        double xu=scanner.nextDouble();
        System.out.print("Maksimum iterasyon:");
        int imax= scanner.nextInt();
        falsePosition(xa,xu,imax);
    }

    public static void falsePosition(double xa, double xu, int imax) {// xa:alt deger, xu:ust deger, imax: maksimum iterasyon sayısı
        int iter=1;
        double ea;
        double es=0.5*Math.pow(10,2-6);//kitapta es=0.5 almıştı ama ben olması gerekene göre yaptım
        double xr=xu-((f(xu)*(xa-xu))/(f(xa)-f(xu)));
        System.out.printf("%-15s%-15s%-15s%-15s%-15s","İterasyon","xa","xu","xr","ea");
        System.out.println("\n------------------------------------------------------------------");
        System.out.printf("%5d%15.6f%15.6f%15.6f%15s\n",iter,xa,xu,xr,"-");//iter=1 için
        do {
            double xrOld=xr;
            if(f(xa)*f(xr)<0){
                xu=xr;
            } else if (f(xa)*f(xr)>0) {
                xa=xr;
            }else {//f(xa)*f(xr)==0 yani kök xr'dir.
                break;
            }
            xr=xu-((f(xu)*(xa-xu))/(f(xa)-f(xu)));
            iter++;
            if(xr==0){//xr=0 olursa ea tanımsız olur
                System.out.printf("%5d%15.6f%15.6f%15.6f%15s\n",iter,xa,xu,xr,"-");
            }else{
                ea=Math.abs((xr-xrOld)/xr)*100;
                System.out.printf("%5d%15.6f%15.6f%15.6f%15.6f\n",iter,xa,xu,xr,ea);
                if(ea<es){
                    break;
                }
            }
        }while (iter<imax);
    }

    public static double f(double c){//Paraşütçü problemi için m=68.1kg, t=10s, v=40m/s, g=9.8m/s^2, c:direnç katsayısı
        if(c==0){//c=0 olduğunda, 667.38/c tanımsız olmalı ama c double olduğu için infinity çıkıyor sonsuz*0 dan NaN yazıyor bu yüzden mauel olarak hatayı fırlattım
            throw new ArithmeticException("c=0 olamaz");
        }
        return (667.38/c)*(1-Math.exp(-0.146843*c))-40;
        //return Math.pow(c,10)-1; // başka bir fonksiyon kökü kökleri {-1,1}
    }

}
