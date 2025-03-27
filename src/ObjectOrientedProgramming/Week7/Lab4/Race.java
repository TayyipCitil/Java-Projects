package ObjectOrientedProgramming.Week7.Lab4;

public class Race {
    public static void main(String[] args) {
        Vehicle uno=new Automobile("Uno",200,0);
        Vehicle tesla=new Automobile("Tesla",200,0);
        Vehicle yamaha=new Motorcycle("Yamaha",100,0);

        Vehicle[] raceCars=new Vehicle[3];
        raceCars[0]=uno;
        raceCars[1]=tesla;
        raceCars[2]=yamaha;
        //yamaha.setSpeed(150);
        int runwayLenght=500;
        boolean isRaceContinue=true;
        Vehicle winner=null;

        while (isRaceContinue){
            for (Vehicle vehicle:raceCars){
                int randomSpeedAmount=(int)(Math.random()*30)+1;
                vehicle.speedUp(randomSpeedAmount);
                vehicle.showSpeed();
                if(vehicle.getDistance()>=runwayLenght){
                    winner=vehicle;
                    isRaceContinue=false;
                    break;
                }
            }
            System.out.println("---------------");
        }
        if(winner instanceof Automobile){
            ((Automobile)winner).hornSound();
        }
        if(winner instanceof Motorcycle){
            ((Motorcycle)winner).frontLift();
        }
    }
}
