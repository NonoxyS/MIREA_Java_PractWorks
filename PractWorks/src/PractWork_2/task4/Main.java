package PractWork_2.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop_obj = new Shop();
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество компьютеров: ");
        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++)
        {
            System.out.println("Компьютер " + (i + 1));

            System.out.print("Введите бренд: ");
            String brand = in.nextLine();

            System.out.print("Введите модель: ");
            String model = in.nextLine();

            shop_obj.addComputer(brand, model);
        }
        System.out.print("Поиск компьютера\nВведите бренд компьютера: ");
        String brand = in.nextLine();

        System.out.print("Введите модель компьютера: ");
        String model = in.nextLine();

        if (shop_obj.FindExactlyComputer(brand, model) != null)
        {
            System.out.println(String.format("Компьютер %s \nМодель: %s",
                    shop_obj.FindExactlyComputer(brand, model).getBrand(),
                    shop_obj.FindExactlyComputer(brand, model).getModel()));
        }
        else
        {
            shop_obj.FindBrandComputer(brand);
        }
    }
}
