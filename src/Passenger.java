public class Passenger {
    private static int counter = 1;
    private int id;

    public Passenger() {
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Passenger#" + id;
    }
}
