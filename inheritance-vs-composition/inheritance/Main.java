public class Main {
    public static void main(String[] args) {
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
    }
}