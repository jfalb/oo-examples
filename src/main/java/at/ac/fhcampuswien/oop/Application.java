package at.ac.fhcampuswien.oop;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        System.out.println("Anzahl Personen: " + Person.getCount());
        System.out.println("Torwart: " + Person.getGoalie());

        System.out.print("Bitte gib einen Namen ein: ");

        Scanner scanner;
        String name;
        int count = 7;

        scanner = new Scanner(System.in);

        name = scanner.next();

        Person employee1 = new Person(name, 20);
        System.out.println("Anzahl Personen: " + Person.getCount());
        Person employee2 = new Person(name, 25);
        System.out.println("Anzahl Personen: " + Person.getCount());
        Person employee3 = new Person(name, 30);
        System.out.println("Anzahl Personen: " + Person.getCount());

        Person.setGoalie(employee3);
        System.out.println("Torwart: " + Person.getGoalie());

        System.out.println(employee1);

        employee1.sayName();

        if (employee1 == employee2) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        if (employee1.equals(employee2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        Person director = employee2;
        director = employee3;
    }
}
