package examples.inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        System.out.println("Running Inheritance Example ...");
        System.out.println("-------------------------------");
        Car car = new Car("Volvo");
        Truck truck = new Truck("Scania");

        car.startEngine();
        car.move();
        car.stopEngine();
        car.openTrunk();

        System.out.println();

        truck.startEngine();
        truck.move();
        truck.stopEngine();
        truck.loadCargo();

        System.out.println();
    }
}
