package PractWork_17.task2;

public class Student<T> {
    private String name;
    private T id;
    private double roll;
    public Student(String name, T id, double roll) {
        setId(id);
        setRoll(roll);
        setName(name);
    }
    private void setRoll(double roll) {
        this.roll = roll;
    }
    private void setName(String name) {
        this.name = name;
    }
    private void setId(T id) {
        this.id = id;
    }
    public double getRoll() {
        return roll;
    }
    public T getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}