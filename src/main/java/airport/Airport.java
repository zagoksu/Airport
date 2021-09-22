package airport;

public class Airport {

    private String name;
    private Airplane[] airplanes;

    public Airport(String name, Airplane[] airplanes) {
        this.name = name;
        this.airplanes = new Airplane[airplanes.length];
        for (int i = 0; i < airplanes.length; i++){
            this.airplanes[i] = airplanes[i];
        }
    }

    public Airport() {
    }

    public void getPassengerPlanes(){
        System.out.println("Passenger planes from airport Eindhoven:");
        for(Airplane airplane: airplanes){
            if(airplane.getType()=="People")
            System.out.println("Passenger Plane " + airplane.getIdentification());
        }
    }

    public void getCargoPlanes(){
        System.out.println("Cargo planes from airport Eindhoven:");
        for(Airplane airplane: airplanes){
            if(airplane.getType()=="Cargo")
                System.out.println("Cargo Plane " + airplane.getIdentification());
        }
    }

    public void requestPassengerPlane(){
        for (Airplane airplane: airplanes){
            if (!airplane.isFlying() && airplane.getType() == "People")
            System.out.println("Airplane " + airplane.getIdentification() + " requested. Is not flying, still room for " + ( ((PeoplePlane) airplane).getMaxNumOfPassengers() - ((PeoplePlane) airplane).getCurrentNumOfPassengers()) + " passengers." );
        }
    }


}
