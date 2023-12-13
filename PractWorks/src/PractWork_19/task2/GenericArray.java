package PractWork_19.task2;

public class GenericArray <T> {
    private T[] genericArray;

    public GenericArray(T[] array) {
        this.genericArray = array;
    }

    public void printGenericArray() {
        for (T t : genericArray) {
            System.out.print(t + " ");
        }
    }

    public String getArrayClass() {
        return genericArray.getClass().getName();
    }

    public T get(int index) {
        if (index >= genericArray.length || index < 0) {
            throw new IndexOutOfBoundsException(String.format("Index out of bounds. Size: %d. Index: %d.",
                    genericArray.length, index));
        }
        for (int i = 0; i < genericArray.length; i++) {
            if (i == index)
                return genericArray[i];
        }
        return null;
    }

    public static void main(String[] args) {
        String[] strArray = {"zxc", "qwe", "ggwp"};
        Integer[] intArray = {1, 2, 3};
        Long[] lArray = {3L, 7L, 123L};

        GenericArray<String> stringArray = new GenericArray<>(strArray);
        stringArray.printGenericArray();
        System.out.print(" - " + stringArray.getArrayClass() + "\n");

        GenericArray<Integer> integerArray = new GenericArray<>(intArray);
        integerArray.printGenericArray();
        System.out.print(" - " + integerArray.getArrayClass() + "\n");

        GenericArray<Long> longArray = new GenericArray<>(lArray);
        longArray.printGenericArray();
        System.out.print(" - " + longArray.getArrayClass() + "\n");

        System.out.println(stringArray.get(2));
    }
}
