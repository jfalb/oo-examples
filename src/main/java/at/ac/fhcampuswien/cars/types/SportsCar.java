package at.ac.fhcampuswien.cars.types;

public class SportsCar extends Car {

    public SportsCar(int speed) {
        super(speed);
    }

    @Override
    public void accelerate() {
        super.accelerate();
        speed += 15;
    }
}
