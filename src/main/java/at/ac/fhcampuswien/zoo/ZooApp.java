package at.ac.fhcampuswien.zoo;

public class ZooApp {

    public static void main(String[] args) {
        AnimalBehaviour[] animals = new AnimalBehaviour[4];

        Lion l1 = new Lion("Leo");
        animals[0] = l1;
        animals[1] = new Bird("Hans");
        animals[2] = new Bird("Sue");
        animals[3] = new Elephant(1340);

        System.out.println("Name des Löwen: " + l1.getName());
        l1.eat();

        feed(animals);
    }

    public static void feed(AnimalBehaviour[] animalBehaviours) {
        for (AnimalBehaviour animal: animalBehaviours) {
            animal.eat();
        }
    }
}
