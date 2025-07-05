import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Vehicle> vehicles = new ArrayList<>();
    private int lostRequests = 0;

    public Company() {
        // Initialize with 3 vehicles by default
        for (int i = 0; i < 3; i++) {
            vehicles.add(new Vehicle());
        }
    }

    // Schedules a pickup for a passenger
    public boolean schedulePickup(Passenger passenger, Location pickup, Location destination) {
        for (Vehicle v : vehicles) {
            if (v.isAvailable()) {
                v.assign();
                System.out.println("Scheduled " + passenger + " from " + pickup + " to " + destination);
                return true;
            }
        }

        lostRequests++;
        System.out.println("No vehicle available for " + passenger);
        return false;
    }

    public int getLostRequests() {
        return lostRequests;
    }

    // For test: mark all vehicles busy
    public void clearAvailableVehicles() {
        for (Vehicle v : vehicles) {
            v.assign();
        }
    }

    // For test: reset all vehicles to available
    public void resetVehicles() {
        for (Vehicle v : vehicles) {
            v.release();
        }
    }
}
