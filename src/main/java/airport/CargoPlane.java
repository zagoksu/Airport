package airport;

public class CargoPlane extends Airplane{

        private long cargoCapacity = 20;

    public CargoPlane(String identification, boolean isFlying, double cruiseSpeed, long cargoCapacity) {
        super(identification, isFlying, cruiseSpeed, "Cargo");
        this.cargoCapacity = cargoCapacity;
    }


    @Override
    protected void load(long amount) {
        if(amount <= cargoCapacity){
            System.out.println("Airplane " + this.identification + " loads " + amount + " tons of cargo, still room for " + (cargoCapacity - amount) + " tons of freight.");
        }else{
            System.out.println("Airplane " + this.identification + " loads " + cargoCapacity + " tons of cargo," + (amount - cargoCapacity) + " tons do not fit.");
        }
    }

    @Override
    protected void unload(long amount) {
        System.out.println("Airplane " + identification + " unloads " + amount + " tons of cargo.");
    }

    public long getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(long cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        return "CargoPlane{" +
                "identification='" + identification + '\'' +
                ", isFlying=" + isFlying +
                ", cruiseSpeed=" + cruiseSpeed +
                ", cargoCapacity=" + cargoCapacity +
                '}';
    }
}
