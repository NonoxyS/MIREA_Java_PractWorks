package PractWork_3.task1;

import java.io.IOException;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) throws IOException {
        String name;
        String email;
        char gender;
        Scanner in = new Scanner(System.in);

        System.out.print("Write name: ");
        name = in.nextLine();

        System.out.print("Write email: ");
        while (true)
        {
            email = in.nextLine();
            if (email.contains("@"))
                break;
            System.out.print("Write correct email: ");
        }

        System.out.print("Write gender(M/F/U): ");
        while (true)
        {
            gender = (char) System.in.read();
            if (Character.toUpperCase(gender) == 'M' || Character.toUpperCase(gender) == 'F'
                    || Character.toUpperCase(gender) == 'U')
                break;
            else if (gender != '\n')
                System.out.print("Write correct gender(M/F/U): ");
        }

        Author object = new Author(name, email, Character.toUpperCase(gender));

        System.out.println(object.toString());
    }
}
