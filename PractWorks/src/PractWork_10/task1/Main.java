package PractWork_10.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        triangleSequence(1, 10);
    }

    public static void triangleSequence(int n, int k)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print(n + " ");
        }

        if (n == k)
            return;
        System.out.print("| ");
        triangleSequence(n + 1, k);
    }
}
