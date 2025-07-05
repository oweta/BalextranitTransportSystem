import java.util.Random;

/**
 * The PassengerSource class represents an origin of passenger requests,
 * such as individuals, hotels, or companies. It interacts with the Company
 * to schedule pickups.
 */
public class PassengerSource {
    private Company company;
    private Random random;

    /**
     * Constructor that accepts a Company object.
     * This allows the PassengerSource to interact with the company's dispatch system.
     * 
     * @param company The transportation company handling vehicle scheduling.
     */
    public PassengerSource(Company company) {
        this.company = company;
        this.random = new Random(); // For generating random locations
    }

    /**
     * Requests a pickup for a new passenger.
     * This method creates a Passenger object and two Location objects (pickup and destination),
     * then attempts to schedule a vehicle using the company.
     * 
     * @return true if a vehicle was successfully scheduled, false otherwise.
     */
    public boolean requestPickup() {
        // Create a new passenger
        Passenger passenger = new Passenger();

        // Generate random pickup and destination locations
        Location pickup = new Location(random.nextInt(101), random.nextInt(101));
        Location destination = new Location(random.nextInt(101), random.nextInt(101));

        // Attempt to schedule a pickup using the company object
        return company.schedulePickup(passenger, pickup, destination);
    }
}
