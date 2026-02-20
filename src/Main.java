public class Main {
    public static void main(String[] args) {

            Car car = new Car();
            Bike bike = new Bike();
            Boat boat = new Boat();

            CarInterface carInterface = new CarInterface();
            BikeInterface bikeInterface = new BikeInterface();
            BoatInterface boatInterface = new BoatInterface();


            Vehicle[] vehicles  = {car, bike, boat};
            VehicleWithInterface[] vehiclesWithInterface = {carInterface, bikeInterface, boatInterface};

            for (Vehicle vehicle : vehicles) {
                vehicle.go();
            }

            for (VehicleWithInterface vehicleWithInterface : vehiclesWithInterface) {
                vehicleWithInterface.go();
            }

//            car.go();
//            bike.go();
//            boat.go();
    }
}
