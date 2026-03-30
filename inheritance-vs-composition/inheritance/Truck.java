public class Truck extends Vehicle {

    public Truck(String brand) {
        super(brand);
    }

    public void loadCargo() {
        System.out.println(brand + ": loading cargo.");
    }
}