package PractWork_9.task1;

public class Animal implements Nameable {
    private String name;
    private int age;

    public Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return String.format("Name: %s\nAge: %d", name, age);
    }
}
