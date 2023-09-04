package Works.task1;

import java.io.IOException;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.print("Write name: ");
        String name = in.nextLine();

        System.out.print("Write email: ");
        String email = in.nextLine();

        System.out.print("Write gender(M/F): ");
        char gender = (char) System.in.read();

        Author object = new Author(name, email, gender);

        System.out.println(object.toString());
    }
}
