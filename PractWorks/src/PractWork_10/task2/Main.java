package PractWork_10.task2;

public class Main {
    public static void main(String[] args) {
        printSequence(10);
    }

    public static void printSequence(int n)
    {
        if (n > 0) {
            printSequence(n - 1);
            System.out.print(n + " ");
        }
    }
}
