package examples.inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        System.out.println("Running Inheritance Example ...");
        System.out.println("-------------------------------");
        
        Vehicle car = new Car("Volvo");
        Vehicle truck = new Truck("Scania");

        car.startEngine();
        car.drive();   // calls Car's version
        car.stopEngine();
        
        System.out.println();

        truck.startEngine();
        truck.drive(); // calls Truck's version
        truck.stopEngine();

        System.out.println();
    }
}
