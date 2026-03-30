package examples.inheritance;

public class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }

    public void openTrunk() {
        System.out.println(brand + ": trunk opened.");
    }
}