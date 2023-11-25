package PractWork_18.task1;

import PractWork_9.task1.Animal;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        super(name, age);
    }
}
