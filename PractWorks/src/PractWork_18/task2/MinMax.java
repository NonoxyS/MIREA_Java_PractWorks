package PractWork_18.task2;

import java.util.ArrayList;

public class MinMax <T extends Comparable <T>> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T findMix() {
        T min = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i].compareTo(min) < 0)
                min = array[i];
        }
        return min;
    }

    public T findMax() {
        T max = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i].compareTo(max) > 0)
                max = array[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {2, 5, 10, -1, 123, -12, 87};

        MinMax<Integer> minMaxIntObj = new MinMax<>(intArray);
        System.out.println("Max: " + minMaxIntObj.findMax());
        System.out.println("Min: " + minMaxIntObj.findMix());

    }
}
