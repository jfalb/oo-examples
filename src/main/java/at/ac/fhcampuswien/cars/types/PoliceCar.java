package at.ac.fhcampuswien.cars.types;

public class PoliceCar extends Car {

    private boolean isInEmergencyMode;

    public PoliceCar() {
        super(0);
    }

    public boolean isInEmergencyMode() {
        return isInEmergencyMode;
    }

    public void setInEmergencyMode(boolean inEmergencyMode) {
        isInEmergencyMode = inEmergencyMode;
    }

}
