package PractWork_19.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListConverter {
    public static <T> List<T> convertArrayToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {
        String[] strArray = {"zxc", "qwe", "ggwp"};
        List<String> strList = convertArrayToList(strArray);
        System.out.println("String list: " + strList);

        Integer[] intArray = {1, 2, 3};
        List<Integer> intList = convertArrayToList(intArray);
        System.out.println("Integer list: " + intList);
    }
}
