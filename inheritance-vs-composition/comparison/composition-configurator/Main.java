public class Main {
    public static void main(String[] args) {
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
    }
}