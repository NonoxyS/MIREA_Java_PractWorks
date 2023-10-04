package PractWork_6.task2;

class Doberman extends Dog {
    public Doberman(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println("Гав! Я доберман.");
    }
}