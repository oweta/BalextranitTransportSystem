public class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public void notifyArrival(Location location) {
        System.out.println(name + " arrived at " + location);
    }

    public void notifyDropOff(Passenger passenger) {
        System.out.println(name + " dropped off " + passenger);
    }
}
