package PractWork_10.task17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxnumb = getMaxNumber(in, 0);
        System.out.println("Максимальное число: " + maxnumb);
    }

    public static int getMaxNumber(Scanner in, int max) {
        int num = in.nextInt();

        if (num == 0) {
            return max;
        }

        if (num > max) {
            return getMaxNumber(in, num);
        }
        else {
            return getMaxNumber(in, max);
        }
    }
}