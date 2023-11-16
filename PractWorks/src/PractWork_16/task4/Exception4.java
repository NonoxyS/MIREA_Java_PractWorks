package PractWork_16.task4;

import java.util.Scanner;

public class Exception4 {
    public static void exceptionDemo() {
        Scanner myScanner = null;
        try {
            myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e) {
            System.out.println("Input string is not an Integer");
        }
        catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
        finally {
            System.out.println("This block gets executed regardless of an Exception.");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}