package examples.compositionconfigurator;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        System.out.println("Running Composition Configurator Example ...");
        System.out.println("--------------------------------------------");
        
        Car electricCityCar = new Car(
            new ElectricEngine(),
            new FrontWheelDrive()
        );

        Car dieselOffRoadCar = new Car(
            new DieselEngine(),
            new AllWheelDrive()
        );

        electricCityCar.drive();

        System.out.println();

        dieselOffRoadCar.drive();

        System.out.println();
    }
}
