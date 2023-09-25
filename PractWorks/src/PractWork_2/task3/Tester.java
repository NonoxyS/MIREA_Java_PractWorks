package PractWork_2.task3;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args)
    {
        double x, y, radius;
        int n;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во кругов: ");
        n = in.nextInt();
        Circle[] circles = new Circle[n];

        System.out.println("Введите x, y, radius через пробел");
        String line = in.nextLine();
        for (int i = 0; i < n; i++)
        {
            System.out.printf("Круг %d: ", i + 1);
            line = in.nextLine();
            String [] data = line.split(" ");
            circles[i] = new Circle(new Point(Double.parseDouble(data[0]), Double.parseDouble(data[1])),
                    Double.parseDouble(data[2]));
        }
        System.out.println("\n" + circles[0].toString() + "\n"); // Test
        circles[0].setX(0);
        circles[0].setY(0);
        circles[0].setRadius(111); // End test

        for (int i = 0; i < n; i++)
        {
            System.out.println(String.format("Круг %d:\n%s\n", i + 1, circles[i].toString()));
        }
    }
}
