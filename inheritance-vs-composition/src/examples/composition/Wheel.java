package examples.composition;

public class Wheel {
    private final int position;

    public Wheel(int position) {
        this.position = position;
    }

    public void rotate() {
        System.out.println("Wheel " + position + " is rotating.");
    }
}
