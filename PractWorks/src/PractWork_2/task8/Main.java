package PractWork_2.task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Заполните массив строками через пробел: ");
        String line = in.nextLine();
        String[] array = line.split(" ");

        for (int i = 0; i < array.length / 2; i++)
        {
            String temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;
        }

        System.out.print("Перевёрнутый массив: ");
        for (String l : array)
        {
            System.out.print(l + " ");
        }
    }
}
