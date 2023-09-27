package PractWork_5.task1_3;

public class Circle extends Shape{
    private double radius;
    public Circle()
    {
        super();
        radius = 1;
    }

    public Circle(double radius)
    {
        super();
        this.radius = radius;
    }

    public Circle (String color, boolean filled, double radius)
    {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimetr()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public String ToString()
    {
        return String.format("Area: %.2f" +
                "\nPerimetr: %.2f" +
                "\nColor: %s" +
                "\nIsFilled: %b", getArea(), getPerimetr(), getColor(), isFilled());
    }
}
