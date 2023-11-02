package PractWork_13.task1;

import java.io.*;
import java.util.Scanner;

public class FileCreator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("test_writer.txt", false);
            System.out.print("Текст для ввода в файл: ");
            writer.write(in.nextLine());
            writer.flush();
            System.out.println("Информация успешно записана в файл.");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
