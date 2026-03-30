package examples.compositionconfigurator;

public class AllWheelDrive implements DriveTrain {
    @Override
    public void transferPower() {
        System.out.println("Power sent to all wheels.");
    }
}