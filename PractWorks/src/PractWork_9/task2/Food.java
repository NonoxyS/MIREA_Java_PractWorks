package PractWork_9.task2;

public class Food implements Priceable{
    private String name;
    private double price;

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice()
    {
        return price;
    }
}
