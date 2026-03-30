public class Main {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        DieselCar dieselCar = new DieselCar();

        electricCar.drive();
        electricCar.chargeBattery();

        System.out.println();

        dieselCar.drive();
        dieselCar.refuel();
    }
}