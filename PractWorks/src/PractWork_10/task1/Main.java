package PractWork_10.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxnumb = getMaxNumber(in, 0);
        System.out.println("Максимальное число: " + maxnumb);
    }

    public static void triangleSequence(int n, int k)
    {
        for (int i = n; i <= k; i++)
        {
            System.out.print(i);
        }

        if (n == k)
            return;
    }
}
