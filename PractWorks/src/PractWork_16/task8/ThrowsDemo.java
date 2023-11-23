package PractWork_16.task8;

import java.util.Scanner;

public class ThrowsDemo {
    public static void getKey() {
        while (true) {
            try {
                Scanner myScanner = new Scanner(System.in);
                String key = myScanner.nextLine();
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println("An occured error: " + e.getMessage() + ". Please, try again.");
            }
        }
    }
    public static void printDetails(String key) throws Exception {
            String message = getDetails(key);
            System.out.println(message);
    }
    private static String getDetails(String key) throws Exception {
        if ("".equals(key)) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        getKey();
    }
}