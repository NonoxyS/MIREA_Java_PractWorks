package PractWork_4.task1;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите радиус: ");
        double radius = in.nextDouble();
        Circle circle_obj = new Circle(radius);
        System.out.println(circle_obj.ToString());

        System.out.print("\nВведите новый радиус: ");
        radius = in.nextDouble();
        circle_obj.setRadius(radius);

        System.out.println("\nКруг с изменённым радиусом: ");
        System.out.print(circle_obj.ToString());
    }
}
