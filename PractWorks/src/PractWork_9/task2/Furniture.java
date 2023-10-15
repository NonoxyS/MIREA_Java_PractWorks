package PractWork_9.task2;

public class Furniture implements Priceable {
    private String name;
    private double price;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice()
    {
        return price;
    }

    public String getName() {
        return name;
    }
}
