package at.ac.fhcampuswien.cars.types;

public class Car {

    public static final int MAX_ALLOWED_SPEED = 100;

    protected int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    public void accelerate() {
        incrementSpeed(5);
    }

    private void incrementSpeed(int value) {
        speed += value;
    }

    public int getSpeed() {
        return speed;
    }

    public void turnLeft() {
        System.out.println("Turning left");
    }

    public void turnRight() {
        System.out.println("Turning right");
    }
}
