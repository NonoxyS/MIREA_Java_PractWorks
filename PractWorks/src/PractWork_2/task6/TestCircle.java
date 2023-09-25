package PractWork_2.task6;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle_obj = new Circle();
        ArrayList <Circle> circles = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.print("Введите кол-во кругов: ");
        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++)
        {
            System.out.println("\nКруг " + (i + 1));
            System.out.print("Введите радиус: ");
            double radius = in.nextDouble();
            circles.add(new Circle(radius));
        }

        System.out.println("\nСписок окружностей:");
        for (int i = 0; i < circles.size(); i++)
        {
            System.out.println("\n" + (i + 1) + " Окружность\n" + circles.get(i).ToString());
        }

        if (circles.size() > 1)
        {
            System.out.print("\nВведите номер 1-й окружности для сравнения: ");
            int circle_number_1 = in.nextInt() - 1;

            System.out.print("Введите номер 2-й окружности для сравнения: ");
            int circle_number_2 = in.nextInt() - 1;

            System.out.print(circle_obj.compareCircles(circles.get(circle_number_1), circles.get(circle_number_2)));
        }
    }
}
