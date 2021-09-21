package airport;

public class Airplane {

    protected String identification;
    protected boolean isFlying;
    protected double cruiseSpeed;
    private String type;


    public Airplane(String identification, boolean isFlying, double cruiseSpeed, String type) {
        this.identification = identification;
        this.isFlying = isFlying;
        this.cruiseSpeed = cruiseSpeed;
        this.type = type;
    }

    public Airplane() {
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


