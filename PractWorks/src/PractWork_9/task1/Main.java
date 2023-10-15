package PractWork_9.task1;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Nameable car = new Car("DODGE Challanger GT", 717);
        Nameable planet = new Planet("Mars", 6794);
        Nameable animal = new Animal("Dog", 3);

        System.out.println(car.getName());
        System.out.println("\n" + planet.getName());
        System.out.println("\n" + animal.getName());
    }
}