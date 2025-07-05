import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CompanyTest {
    private Company company;
    private Passenger passenger;
    private Location pickup;
    private Location destination;

    @BeforeEach
    public void setUp() {
        company = new Company();
        passenger = new Passenger();
        pickup = new Location(10, 20);
        destination = new Location(50, 60);
    }

    @Test
    public void testSchedulePickupSuccess() {
        // Should return true because vehicles are available
        boolean result = company.schedulePickup(passenger, pickup, destination);
        assertTrue(result, "Pickup should be scheduled successfully");
    }

    @Test
    public void testSchedulePickupFailureWhenNoVehiclesAvailable() {
        // First, make all vehicles unavailable
        company.clearAvailableVehicles();
        boolean result = company.schedulePickup(passenger, pickup, destination);
        assertFalse(result, "Pickup should fail due to no available vehicles");
    }
}
