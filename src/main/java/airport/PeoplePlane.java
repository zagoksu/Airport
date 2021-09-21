package airport;

public class PeoplePlane extends Airplane{

    private long maxNumOfPassengers;
    private long currentNumOfPassengers;

    public PeoplePlane(String identification, long maxNumOfPassengers,  double cruiseSpeed, boolean isFlying, long currentNumOfPassengers) {
        super(identification, isFlying, cruiseSpeed, "People");
        this.maxNumOfPassengers = maxNumOfPassengers;
        this.currentNumOfPassengers = currentNumOfPassengers;
    }


    public void loadPassengers(long passengers){

        if(passengers <= maxNumOfPassengers){
            System.out.println("Airplane " + this.identification + " charges " + passengers + " passengers.");
            currentNumOfPassengers += passengers;
        }else{
            System.out.println("Airplane " + this.identification + " charges " + maxNumOfPassengers + " passengers," + (passengers - maxNumOfPassengers) + " do not fit.");
        }

    }

    public void unloadPassengers(long passengers){
        currentNumOfPassengers -= passengers;
        System.out.println("Airplane " + identification + " discharges " + passengers + " passengers.");
    }

    public void takeOff(){
        if (!isFlying()){
            this.isFlying = true;
            System.out.println("Airplane " + this.identification + " takes off.");
        } else {
            System.out.println("Airplane " + this.identification + " can not take off, because we are already flying.");
        }
    }

    public void lands(){
        if (isFlying()){
            this.isFlying = false;
            System.out.println("Airplane " + this.identification + " lands.");
        } else {
            System.out.println("Airplane " + this.identification + " can not land, because we are still on the ground.");
        }
    }


    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public long getMaxNumOfPassengers() {
        return maxNumOfPassengers;
    }

    public void setMaxNumOfPassengers(long maxNumOfPassengers) {
        this.maxNumOfPassengers = maxNumOfPassengers;
    }

    public long getCurrentNumOfPassengers() {
        return currentNumOfPassengers;
    }

    public void setCurrentNumOfPassengers(long currentNumOfPassengers) {
        this.currentNumOfPassengers = currentNumOfPassengers;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    public double getCruiseSpeed() {
        return cruiseSpeed;
    }

    public void setCruiseSpeed(double cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }


}


