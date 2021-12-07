package at.ac.fhcampuswien.zoo;

public class Bird implements AnimalBehaviour {

    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Birdie " + name + " is eating corn.");
    }

    @Override
    public int noOfLegs() {
        return 2;
    }

}
