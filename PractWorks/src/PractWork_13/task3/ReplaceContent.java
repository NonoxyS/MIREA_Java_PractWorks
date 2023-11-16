package PractWork_13.task3;

import java.io.*;
import java.util.Scanner;

public class ReplaceContent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("test_writer.txt", false);
            System.out.print("Текст замены содержимого файла: ");
            writer.write(in.nextLine());
            writer.flush();
            System.out.println("Информация успешно заменена в файле.");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
