package ObjectOrientedProgramming.Week11;

import java.util.Scanner;

public class Computer extends ElectronicDevice{
    private String operatingSystem;
    public Computer(String make,double price,String operatingSystem){
        super(make,price);
        this.operatingSystem=operatingSystem;
    }
    public void updateOperatingSystem(String newSystem){
        if(isOpen()){
            System.out.println("İşletim sistemi güncelleniyor\nİşletim sistemi "+newSystem+" olarak güncellendi.");
        }else {
            System.out.println("Cihaz kapalı");
        }
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
