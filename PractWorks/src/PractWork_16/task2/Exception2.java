package PractWork_16.task2;

import java.util.Scanner;

public class Exception2 {
    public static void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Input string is not an Integer");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
