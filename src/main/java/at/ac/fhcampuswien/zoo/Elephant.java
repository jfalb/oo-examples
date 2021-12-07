package at.ac.fhcampuswien.zoo;

public class Elephant implements AnimalBehaviour {

    private int weight;

    public Elephant(int weight) {
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("Elephant is eating leaves.");
    }

    @Override
    public int noOfLegs() {
        return 4;
    }
}
