package PractWork_6.task2;

public class Main {
    public static void main(String[] args) {
        Pitbull pitbull = new Pitbull("Рэкс", 3);
        pitbull.bark();
        System.out.println("Имя: " + pitbull.getName());
        System.out.println("Возраст: " + pitbull.getAge() + "\n");

        Doberman doberman = new Doberman("Мони", 5);
        doberman.bark();
        System.out.println("Имя: " + doberman.getName());
        System.out.println("Возраст: " + doberman.getAge());
    }
}