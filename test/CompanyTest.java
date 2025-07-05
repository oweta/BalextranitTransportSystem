import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit test class for testing the Company class.
 */
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

    /**
     * Test that schedulePickup returns true when vehicles are available.
     */
    @Test
    public void testSchedulePickupSuccess() {
        boolean result = company.schedulePickup(passenger, pickup, destination);
        assertTrue(result, "Pickup should be scheduled successfully when vehicles are available");
    }

    /**
     * Test that schedulePickup returns false when no vehicles are available.
     */
    @Test
    public void testSchedulePickupFailsWhenNoVehiclesAvailable() {
        // Mark all vehicles as unavailable
        company.clearAvailableVehicles();

        boolean result = company.schedulePickup(passenger, pickup, destination);
        assertFalse(result, "Pickup should fail when no vehicles are available");
    }
}
