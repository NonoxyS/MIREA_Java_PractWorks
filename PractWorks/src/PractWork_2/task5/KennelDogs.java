package PractWork_2.task5;

import java.util.ArrayList;

public class KennelDogs {
    private ArrayList <Dog> dogs = new ArrayList<>();

    public void addDog(String name, int age)
    {
        dogs.add(new Dog(name, age));
    }
    public void getAllDogs()
    {
        System.out.println("Все собаки в питомнике: ");
        for (int i = 0; i < dogs.size(); i++)
        {
            System.out.println((i + 1) + " собака");
            System.out.println(dogs.get(i).ToString() + "\n");
        }
    }

    public void setDogName(int number, String name)
    {
        dogs.get(number - 1).setName(name);
    }
    public void setDogAge(int number, int age)
    {
        dogs.get(number - 1).setAge(age);
    }

}
