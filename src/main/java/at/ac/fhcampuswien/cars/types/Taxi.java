package at.ac.fhcampuswien.cars.types;

public class Taxi extends Car {

    private boolean isOnDuty;
    private double taxameterPrice;

    public Taxi(boolean isOnDuty) {
        super(0);
        this.isOnDuty = isOnDuty;
    }

    public boolean isOnDuty() {
        return isOnDuty;
    }

    public void setOnDuty(boolean onDuty) {
        isOnDuty = onDuty;
    }

    public static final int MAX_ALLOWED_SPEED = 100;

}
