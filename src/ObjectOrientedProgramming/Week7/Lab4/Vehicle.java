package ObjectOrientedProgramming.Week7.Lab4;

public class Vehicle {
    private double speed;
    protected int maxSpeed;
    protected String make;
    private double distance;

    public Vehicle(String make, int maxSpeed,double speed ) {
        this(make,maxSpeed,speed,0);
    }

    public Vehicle(String make,int maxSpeed,double speed, double distance) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.make = make;
        this.distance = distance;
    }
    public void speedUp(int amount){
        double firstSpeed=getSpeed();
        setSpeed(getSpeed()+amount);
        double avargeSpeed=(firstSpeed+getSpeed())/2;
        setDistance(getDistance()+avargeSpeed);
    }
    public void speedDown(int amount){
        double firstSpeed=getSpeed();
        setSpeed(getSpeed()-amount);
        double avargeSpeed=(firstSpeed+getSpeed())/2;
        setDistance(getDistance()+avargeSpeed);
    }
    public void showSpeed(){
        System.out.println(getMake()+" aracın hızı:"+getSpeed()+"kat ettiği mesafe:"+getDistance());
    }
    public double getSpeed() {
        return speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getMake() {
        return make;
    }

    public double getDistance() {
        return distance;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
        if(speed<0){
            this.speed=0;
        }
        if(speed>maxSpeed){
            this.speed=maxSpeed;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
