package airport;

public class PeoplePlane extends Airplane{

    private long maxNumOfPassengers;
    private long currentNumOfPassengers;

    public PeoplePlane(String identification, long maxNumOfPassengers,  double cruiseSpeed, boolean isFlying, long currentNumOfPassengers) {
        super(identification, isFlying, cruiseSpeed, "People");
        this.maxNumOfPassengers = maxNumOfPassengers;
        this.currentNumOfPassengers = currentNumOfPassengers;
    }


    @Override
    protected void load(long amount) {
        if(amount <= maxNumOfPassengers){
            System.out.println("Airplane " + this.identification + " charges " + amount + " passengers.");
            currentNumOfPassengers += amount;
        }else{
            System.out.println("Airplane " + this.identification + " charges " + maxNumOfPassengers + " passengers," + (amount - maxNumOfPassengers) + " do not fit.");
        }
    }

    @Override
    protected void unload(long amount) {
        currentNumOfPassengers -= amount;
        System.out.println("Airplane " + identification + " discharges " + amount + " passengers.");
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

    @Override
    public String toString() {
        return "PeoplePlane{" +
                "identification='" + identification + '\'' +
                ", isFlying=" + isFlying +
                ", cruiseSpeed=" + cruiseSpeed +
                ", maxNumOfPassengers=" + maxNumOfPassengers +
                ", currentNumOfPassengers=" + currentNumOfPassengers +
                '}';
    }
}


