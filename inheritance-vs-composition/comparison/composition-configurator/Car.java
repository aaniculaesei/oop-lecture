public class Car {
    private final Engine engine;
    private final DriveTrain driveTrain;

    public Car(Engine engine, DriveTrain driveTrain) {
        this.engine = engine;
        this.driveTrain = driveTrain;
    }

    public void drive() {
        engine.start();
        driveTrain.transferPower();
        System.out.println("Driving configured car.");
        engine.stop();
    }
}