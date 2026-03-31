package examples.inheritance;

public class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public void drive() {
        System.out.println(brand + ": car is driving.");
    }
}