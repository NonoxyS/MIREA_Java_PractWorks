package PractWork_5.task1_3;

public class Rectangle extends Shape {
    private double width, length;

    public Rectangle()
    {
        super();
        this.width = 1;
        this.length = 4;
    }
    public Rectangle(double width, double length)
    {
        super();
        if (width > length) {
            this.width = length;
            this.length = width;
        }
        else {
            this.length = length;
            this.length = length;
        }
    }
    public Rectangle(String color, boolean filled, double width, double length)
    {
        super(color, filled);
        if (width > length) {
            this.width = length;
            this.length = width;
        }
        else {
            this.length = length;
            this.length = length;
        }
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
        return String.format("Area: %.2f" +
                "\nPerimetr: %.2f" +
                "\nColor: %s" +
                "\nIsFilled: %b", getArea(), getPerimetr(), getColor(), isFilled());
    }
}
