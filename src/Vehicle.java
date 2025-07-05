public class Vehicle {
    private boolean available = true;

    public boolean isAvailable() {
        return available;
    }

    public void assign() {
        this.available = false;
    }

    public void release() {
        this.available = true;
    }

    @Override
    public String toString() {
        return "Vehicle[" + (available ? "Available" : "Busy") + "]";
    }
}
