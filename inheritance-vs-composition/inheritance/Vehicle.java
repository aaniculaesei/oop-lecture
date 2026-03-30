public class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void startEngine() {
        System.out.println(brand + ": engine started.");
    }

    public void move() {
        System.out.println(brand + ": vehicle is moving.");
    }

    public void stopEngine() {
        System.out.println(brand + ": engine stopped.");
    }
}