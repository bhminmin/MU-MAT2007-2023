public class Truck extends Car{
    private final double maxLoadWeight;

    public Truck(String licensePlate, double maxLoadWeight) {
        super(licensePlate);
        this.maxLoadWeight = maxLoadWeight;
    }

    public boolean canCarry(int weight) {
        return weight <= maxLoadWeight;
    }

    @Override
    public boolean isOffroadCapable() {
        return false;
    }

    @Override
    public String fuelType() {
        return "Diesel";
    }
}


