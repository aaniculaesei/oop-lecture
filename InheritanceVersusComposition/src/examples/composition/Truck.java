package examples.composition;

public class Truck {
    private final Engine engine;
    private final DriveTrain driveTrain;
    private final Wheel[] wheels;

    public Truck() {
        this.engine = new Engine();
        this.driveTrain = new DriveTrain();
        this.wheels = new Wheel[] {
            new Wheel(1),
            new Wheel(2),
            new Wheel(3),
            new Wheel(4)
        };
    }

    public void move() {
        engine.start();
        driveTrain.transferPower();
        driveTrain.adjustTorque();

        for (Wheel wheel : wheels) {
            wheel.rotate();
        }

        System.out.println("Truck is moving.");
    }
}
