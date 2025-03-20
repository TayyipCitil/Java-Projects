package NumericalAnalysis;

import java.util.Scanner;

public class BiSectionHesap {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Alt deger:");
        double xa=scanner.nextDouble();
        System.out.print("Ust deger:");
        double xu=scanner.nextDouble();
        System.out.print("Maksimum iterasyon:");
        int imax= scanner.nextInt();
        biSection(xa,xu,imax);
    }

    public static void biSection(double xa, double xu, int imax) {// xa:alt deger, xu:ust deger, imax: maksimum iterasyon sayısı
        int iter=0;
        double ea;
        double es=0.5*Math.pow(10,2-6);//kitapta es=0.5 almıştı ama ben olması gerekene göre yaptım
        double xr;
        System.out.printf("%-15s%-15s%-15s%-15s%-15s","İterasyon","xa","xu","xr","ea(%)");
        System.out.println("\n------------------------------------------------------------------");
        do {
            xr=(xa+xu)/2;
            iter++;
            if(xr==0||iter<2){//xr=0 olursa ea tanımsız olur, ea<2 olursa ea hesaplanamaz
                System.out.printf("%5d%15.6f%15.6f%15.6f%15s\n",iter,xa,xu,xr,"-");
            }else{
                ea=Math.abs(((xu-xa)/(xu+xa)))*100;// bir kaç alternatif dene
                System.out.printf("%5d%15.6f%15.6f%15.6f%15.6f\n",iter,xa,xu,xr,ea);
                if(ea<es){
                    break;
                }
            }

            if(f(xa)*f(xr)<0){
                xu=xr;
            } else if (f(xa)*f(xr)>0) {
                xa=xr;
            }else {//f(xa)*f(xr)==0 yani kök xr'dir.
                break;
            }
        }while (iter<imax);
    }

    public static double f(double c){//Paraşütçü problemi için m=68.1kg, t=10s, v=40m/s, g=9.8m/s^2, c:direnç katsayısı
        if(c==0){//c=0 olduğunda, 667.38/c tanımsız olmalı ama c double olduğu için infinity çıkıyor sonsuz*0 dan NaN yazıyor bu yüzden mauel olarak hatayı fırlattım
            throw new ArithmeticException("c=0 olamaz");
        }
        return (667.38/c)*(1-Math.exp(-0.146843*c))-40;
    }
}