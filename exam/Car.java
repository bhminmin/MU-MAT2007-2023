public class Car extends AbstractVehicle {

    public Car(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public boolean isOffroadCapable() {
        return false;
    }

    @Override
    public String fuelType() {
        return "Petrol";
    }
}


