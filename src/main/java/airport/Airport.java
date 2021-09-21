package airport;

public class Airport {

    private String name;
    private Airplane[] airplanes;

    public Airport(String name, Airplane[] airplanes) {
        this.name = name;
        this.airplanes = new Airplane[]{new PeoplePlane("XYZ123", 100, 40, true, 500),
                new PeoplePlane("EEE666", 150, 105, false, 0),
                new PeoplePlane("ZZZ777", 150, 125, false, 0)};
    }

    public Airport() {
    }

    public void getAircraftNames(){
        for(Airplane airplane: airplanes){
            System.out.println("Airplane " + airplane.getIdentification());
        }
    }

    public void requestPeoplePlane(){
        for (Airplane airplane: airplanes){
            if (!airplane.isFlying())
            System.out.println("Airplane " + airplane.getIdentification() + " requested. Is not flying, still room for " + ( ((PeoplePlane) airplane).getMaxNumOfPassengers() - ((PeoplePlane) airplane).getCurrentNumOfPassengers()) + " passengers." );
        }
    }


}
