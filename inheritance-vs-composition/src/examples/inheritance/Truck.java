package examples.inheritance;

public class Truck extends Vehicle {

    public Truck(String brand) {
        super(brand);
    }

    @Override
    public void drive() {
        System.out.println(brand + ": truck is hauling.");
    }
}
