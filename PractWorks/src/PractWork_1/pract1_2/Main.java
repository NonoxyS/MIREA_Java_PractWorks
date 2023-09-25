package PractWork_1.pract1_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int [] array = new int[n];
        int min_numb = Integer.MAX_VALUE, max_numb = Integer.MIN_VALUE, i = 0, summ = 0;
        System.out.print("Введите числа через пробел: ");
        while (i < n)
        {
            array[i] = in.nextInt();

            if (max_numb < array[i])
                max_numb = array[i];

            if (min_numb > array[i])
                min_numb = array[i];

            summ += array[i]; i++;
        }
        System.out.printf("Сумма: %d \nМин. число: %d \nМакс. число: %d", summ, min_numb, max_numb);
    }
}
