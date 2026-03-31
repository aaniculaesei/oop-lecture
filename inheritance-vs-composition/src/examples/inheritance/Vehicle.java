package examples.inheritance;

public class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void startEngine() {
        System.out.println(brand + ": engine started.");
    }

    public void drive() {
        System.out.println(brand + ": vehicle is driving.");
    }

    public void stopEngine() {
        System.out.println(brand + ": engine stopped.");
    }
}
