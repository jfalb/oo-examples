package at.ac.fhcampuswien.cars;

import at.ac.fhcampuswien.cars.types.PoliceCar;
import at.ac.fhcampuswien.cars.types.SportsCar;
import at.ac.fhcampuswien.cars.types.Taxi;

public class App {

    public static void main(String[] args) {
        PoliceCar car1 = new PoliceCar();
        car1.accelerate();
        car1.turnLeft();
        System.out.println("Speed is " + car1.getSpeed());
        car1.setInEmergencyMode(true);

        Taxi car2 = new Taxi(false);
        car2.accelerate();
        car2.turnLeft();
        System.out.println("Speed is " + car2.getSpeed());
        car2.setOnDuty(true);

        SportsCar car3 = new SportsCar(80);
        car3.accelerate();
        car3.turnLeft();
        System.out.println("Speed is " + car3.getSpeed());

        System.out.println("Car3: " + car3.getClass().getName());
    }
}
