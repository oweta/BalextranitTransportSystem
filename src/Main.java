public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        PassengerSource source = new PassengerSource(company);

        // Try multiple pickup requests
        for (int i = 0; i < 5; i++) {
            boolean result = source.requestPickup();
            System.out.println("Request " + (i + 1) + " => " + (result ? "Success" : "Failed"));
        }

        System.out.println("Total lost requests: " + company.getLostRequests());
    }
}
