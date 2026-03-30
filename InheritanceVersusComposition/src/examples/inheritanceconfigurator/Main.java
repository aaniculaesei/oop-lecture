package examples.inheritanceconfigurator;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        System.out.println("Running Inheritance Configurator Example ...");
        System.out.println("--------------------------------------------");

        ElectricCar electricCar = new ElectricCar();
        DieselCar dieselCar = new DieselCar();

        electricCar.drive();
        electricCar.chargeBattery();

        System.out.println();

        dieselCar.drive();
        dieselCar.refuel();

        System.out.println();
    }
}
