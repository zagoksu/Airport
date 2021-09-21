package airport;

public class CargoPlane extends Airplane{

        private long cargoCapacity = 20;

    public CargoPlane(String identification, boolean isFlying, double cruiseSpeed, long cargoCapacity) {
        super(identification, isFlying, cruiseSpeed, "Cargo");

        this.cargoCapacity = cargoCapacity;
    }

    public CargoPlane(long cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void loadCargo(long cargo){

        if(cargo <= cargoCapacity){
            System.out.println("Airplane " + this.identification + " loads " + cargo + " tons of cargo.");
        }else{
            System.out.println("Airplane " + this.identification + " loads " + cargo + " tons of cargo.," + (cargo - cargoCapacity) + " tons do not fit.");
        }

    }

    public void unloadCargo(long cargo){
        System.out.println("Airplane " + identification + " unloads " + cargo + " tons of cargo.");
    }

}
