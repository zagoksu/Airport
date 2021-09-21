package airport;

public class Application {


    public static void main(String[] args) {
        System.out.println("Test");

        PeoplePlane ABC123 = new PeoplePlane("ABC123",33,0,true,700);
        PeoplePlane DDD888 = new PeoplePlane("DDD888", 80, 0,false,0);

        ABC123.loadPassengers(43);
//        ABC123.takeOff();
//        ABC123.lands();
//        ABC123.unloadPassengers(33);
//        ABC123.loadPassengers(22);

        Airport airport = new Airport("Eindhoven",new Airplane[]{new PeoplePlane("XYZ123", 100, 40, true, 500),
                new PeoplePlane("EEE666", 150, 125, false, 0),
                new PeoplePlane("ZZZ777", 150, 125, false, 0),
        new CargoPlane("Cargo123", true, 100,20),
        new CargoPlane("CargoXYZ", false,0,20)});
        airport.getAircraftNames();
        airport.requestPeoplePlane();


    }
}
