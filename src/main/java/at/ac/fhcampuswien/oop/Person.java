package at.ac.fhcampuswien.oop;

import java.util.Objects;

public class Person {

    private static int count = 0;
    private static Person goalie;

    private String name;
    private int age;
    private double salary;
    private String comments;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        comments = "";
        count += 1;
    }

    public static int getCount() {
        return count;
    }

    public static Person getGoalie() {
        return goalie;
    }

    public static void setGoalie(Person p) {
        goalie = p;
    }

    public void sayName() {
        System.out.println("My name is " + name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        }
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
