package PractWork_18.task1;

import PractWork_9.task1.Animal;

import java.io.Serializable;

public class GenericClass <T extends Comparable <T>, V extends Animal & Serializable, K>{
    private T variableT;
    private V variableV;
    private K variableK;

    public GenericClass(T variableT, V variableV, K variableK) {
        this.variableT = variableT;
        this.variableV = variableV;
        this.variableK = variableK;
    }

    public T getVariableT() {
        return variableT;
    }

    public V getVariableV() {
        return variableV;
    }

    public K getVariableK() {
        return variableK;
    }

    public void printClassNames() {
        System.out.println("Class of variableT: " + variableT.getClass().getName());
        System.out.println("Class of variableV: " + variableV.getClass().getName());
        System.out.println("Class of variableK: " + variableK.getClass().getName());
    }

    public static void main(String[] args) {
        Integer integerValue = 10;
        Dog dog = new Dog("Rax", 2);
        double doubleValue = 3.14;

        GenericClass<Integer, Dog, Double> genericObj = new GenericClass<>(integerValue, dog, doubleValue);

        genericObj.printClassNames();
    }
}
