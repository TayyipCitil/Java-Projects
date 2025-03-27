package ObjectOrientedProgramming.Week7.Lab4;

public class Motorcycle extends Vehicle{
    public Motorcycle(String make,int maxSpeed,double speed){
        super(make,maxSpeed,speed);
    }
    public void speedUp(){
        super.speedUp(10);
    }
    public void speedDown(){
        super.speedDown(10);
    }
    void frontLift(){
        System.out.println(getMake()+" marka motor ön kaldırdı ve devrildi");
        setSpeed(0);
    }
}
