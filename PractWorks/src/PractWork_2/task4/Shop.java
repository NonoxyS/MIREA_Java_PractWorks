package PractWork_2.task4;

import java.util.ArrayList;

public class Shop {
    private ArrayList <Computer> computers = new ArrayList<>();

    public void addComputer(String brand, String model)
    {
        computers.add(new Computer(brand, model));
    }

    public void removeComputer(Computer computer)
    {
        computers.remove(computer);
    }

    public Computer FindExactlyComputer(String brand, String model)
    {
        for (Computer computer : computers)
        {
            if (computer.getBrand().equalsIgnoreCase(brand) && computer.getModel().equalsIgnoreCase(model))
                return computer;
        }
        return null;
    }
    public void FindBrandComputer(String brand)
    {
        ArrayList <Computer> model_computers = new ArrayList<>();
        for (Computer computer : computers)
        {
            if (computer.getBrand().equalsIgnoreCase(brand))
                model_computers.add(computer);
        }

        if (model_computers.isEmpty())
            System.out.println("Таких компьютеров нет!");

        System.out.println("Данной модели нет, все компьютеры данного бренда в наличии: ");
        for (Computer computer : model_computers)
        {
            System.out.println(String.format("Компьютер %s\nМодель: %s", computer.getBrand(), computer.getModel()));
        }
    }
}
