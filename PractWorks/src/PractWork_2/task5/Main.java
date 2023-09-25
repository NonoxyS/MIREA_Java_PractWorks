package PractWork_2.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KennelDogs KennelDogs_obj = new KennelDogs();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во собак для добавления: ");
        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++)
        {
            System.out.println((i + 1) + " собака для добавления");

            System.out.print("Имя: ");
            String name = in.nextLine();

            System.out.print("Возраст: ");
            int age = in.nextInt();
            in.nextLine();
            KennelDogs_obj.addDog(name, age);
        }

        KennelDogs_obj.getAllDogs(); // Вывод всех собак

        KennelDogs_obj.setDogName(1, "ChangedName");
        KennelDogs_obj.setDogAge(1, 111);

        KennelDogs_obj.getAllDogs();
    }
}
