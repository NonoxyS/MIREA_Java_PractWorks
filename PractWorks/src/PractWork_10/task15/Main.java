package PractWork_10.task15;

public class Main {
    public static int printNumbers(int x)
    {
        if (x > 0)
        {
            System.out.print(x % 10 + " ");
            return printNumbers(x / 10);
        }
        return 0;
    }
    public static void main(String[] args) {
        printNumbers(12345);
    }
}