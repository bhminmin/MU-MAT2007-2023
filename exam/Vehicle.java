import java.util.HashMap;
import java.util.Map;

public interface Vehicle {
    String getLicensePlate();
    boolean isOffroadCapable();
    String fuelType();
    static void printVehicleDetails(Map<String, Vehicle> vehicles) {
        for (String license : vehicles.keySet()) {
            Vehicle v = vehicles.get(license);
            System.out.println("Vehicle license: " + v.getLicensePlate());
            System.out.println("Is the vehicle off-road capable? " + v.isOffroadCapable());
            System.out.println("Fuel type: " + v.fuelType());
            System.out.println("------");
        }
    }
}
