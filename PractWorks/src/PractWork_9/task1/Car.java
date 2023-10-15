package PractWork_9.task1;

public class Car implements Nameable {
    private String name;
    private int hp;

    public Car(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    @Override
    public String getName() {
        return String.format("Name: %s\nHP: %d", name, hp);
    }
}
