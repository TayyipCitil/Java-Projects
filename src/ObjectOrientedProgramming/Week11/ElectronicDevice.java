package ObjectOrientedProgramming.Week11;

public class ElectronicDevice {
    protected String make;
    protected double price;
    private boolean status=false;

    public ElectronicDevice(String make,double price){
        this.make = make;
        this.price = price;

    }
    public void close(){
        if(status==false){
            System.out.println("Zaten kapalı");
        }else {
            System.out.println(make+" cihaz kapandı");
            status = false;
        }
    }

    public void open(){
        if(status==true){
            System.out.println("Zaten açık");
        }else {
            System.out.println(make+" cihaz açıldı");
            status=true;
        }
    }
    public boolean isOpen(){
        return status;
    }
}
