public class Motorcycle extends AbstractVehicle {

    public Motorcycle(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public boolean isOffroadCapable() {
        return true;
    }

    @Override
    public String fuelType() {
        return "Petrol";
    }
}
