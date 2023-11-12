import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
    private Map<String, Vehicle> registry = new HashMap<>();

    public void add(Vehicle vehicle) {
        if (vehicle != null && vehicle.getLicensePlate() != null) {
            registry.put(vehicle.getLicensePlate(), vehicle);
        } else {
            throw new IllegalArgumentException("Vehicle or its license plate cannot be null.");
        }
    }

    public Vehicle get(String licensePlate) {
        return registry.get(licensePlate);
    }

    public Map<String, Vehicle> getAllVehicles() {
        return registry;
    }
}
