package PractWork_5.task1_3;

public class Rectangle extends Shape {
    protected double width, length;

    public Rectangle()
    {
        super();
        this.width = 1;
        this.length = 4;
    }
    public Rectangle(double width, double length)
    {
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(String color, boolean filled, double width, double length)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea()
    {
        return width * length;
    }

    @Override
    public double getPerimetr()
    {
        return 2 * (width + length);
    }

    @Override
    public String ToString()
    {
        return String.format("Area: %.2f\nPerimetr: %.2f", getArea(), getPerimetr());
    }
}
