package PractWork_2.task5;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}

    public String getName() {return name;}
    public int getAge() {return age;}

    public int toHumanAge(int age) {return age * 7;}
    public String ToString()
    {
        return "Имя: " + name +
                "\nВозраст: " + age +
                "\nВозраст на человеческий лад: " + toHumanAge(age);
    }
}
