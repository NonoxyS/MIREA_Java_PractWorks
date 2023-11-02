package PractWork_13.task4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendContent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("test_writer.txt", true);
            System.out.print("Текст для добавления в конец файла: ");
            writer.write(in.nextLine());
            writer.flush();
            System.out.println("Текст успешно добавлен в конец файла.");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
