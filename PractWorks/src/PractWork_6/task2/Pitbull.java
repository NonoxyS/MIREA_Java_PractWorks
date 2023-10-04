package PractWork_6.task2;

class Pitbull extends Dog {
    public Pitbull(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println("Гав! Я питбуль.");
    }
}