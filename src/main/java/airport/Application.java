package airport;

public class Application {


    public static void main(String[] args) {
        System.out.println("Test");

        PeoplePlane ABC123 = new PeoplePlane("ABC123",33,0,true,700);
        PeoplePlane DDD888 = new PeoplePlane("DDD888", 80, 0,false,0);
        CargoPlane CargoXYZ = new CargoPlane("Cargo123", true, 100,20);
        PeoplePlane XYZ123 = new PeoplePlane("XYZ123", 100, 40, true, 500);
        CargoPlane CargoABC = new CargoPlane("CargoABC", false,0,20);

        Airport airport1 = new Airport("Eindhoven",new Airplane[]{
                XYZ123,
                ABC123,
                DDD888,
                CargoXYZ,
                CargoABC});

        ABC123.load(43);
//        ABC123.takeOff();
//        ABC123.lands();
//        ABC123.unloadPassengers(33);
//        ABC123.loadPassengers(22);
        CargoXYZ.load(25);
        CargoXYZ.unload(25);
        CargoXYZ.load(12);


        airport1.getPassengerPlanes();
        airport1.getCargoPlanes();

        airport1.requestPassengerPlane();



    }
}
