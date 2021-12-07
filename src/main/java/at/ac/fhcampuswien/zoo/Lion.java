package at.ac.fhcampuswien.zoo;

public class Lion implements AnimalBehaviour {

    private String name;

    public Lion(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating meat.");
    }

    @Override
    public int noOfLegs() {
        return 4;
    }
}
