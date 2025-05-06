package ObjectOrientedProgramming.Week11;

import java.util.Scanner;

public class Phone extends ElectronicDevice{
    private String  phoneNumber;
    public Phone(String make,double price, String phoneNumber){
        super(make,price);
        this.phoneNumber=phoneNumber;
    }
    public void call(String callNumber){
        if(isOpen()){
            System.out.println(getPhoneNumber()+" numaralı telefon,"+callNumber+" numaralı telefonu arıyor...");
        }else{
            System.out.println("Cihaz kapalı");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
