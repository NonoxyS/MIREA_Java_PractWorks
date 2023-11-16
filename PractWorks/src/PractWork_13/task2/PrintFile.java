package PractWork_13.task2;

import java.io.*;
import java.util.Scanner;

public class PrintFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            FileReader reader = new FileReader("test_writer.txt");
            System.out.print("Содержимое файла: ");
            int ch;
            while ((ch = reader.read()) != -1)
            {
                System.out.print((char) ch);
            }
            System.out.println("\nИнформация успешно выведена на экран.");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
