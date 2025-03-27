package ObjectOrientedProgramming.Week7.Lab4;

public class Automobile extends Vehicle{
    public Automobile(String make,int maxSpeed,double speed){
        super(make,maxSpeed,speed);
    }

    public void speedUp(){
        super.speedUp(15);
    }
    public void speedDown(){
        super.speedDown(15);
    }
    void hornSound(){
        System.out.println(make+" marka otomobilin kornası çalıyor: DÜT DÜT");
    }
}
