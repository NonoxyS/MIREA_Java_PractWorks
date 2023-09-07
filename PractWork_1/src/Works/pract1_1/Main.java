package Works.pract1_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int [] array = new int[n];
        int summ = 0;
        System.out.print("Введите числа через пробел: ");
        for (int i = 0; i < n; i++)
        {
            array[i] = in.nextInt();
            summ += array[i];
        }
        System.out.printf("Сумма: %d \nСр. арефметическое: %f", summ, (float)summ / n);
    }
}