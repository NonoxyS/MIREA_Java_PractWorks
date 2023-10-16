package PractWork_10.task16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = countMaxElements(in, 0, 0);
        System.out.println("Количество элементов, равных максимуму: " + count);
    }

    public static int countMaxElements(Scanner in, int max, int count) {
        int num = in.nextInt();

        if (num == 0) {
            return count;
        }

        if (num > max) {
            return countMaxElements(in, num, 1);
        }
        else if (num == max) {
            return countMaxElements(in, max, count + 1);
        }
        else {
            return countMaxElements(in, max, count);
        }
    }
}