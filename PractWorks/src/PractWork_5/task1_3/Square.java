package PractWork_5.task1_3;

public class Square extends Rectangle {
    private double side;

    public Square()
    {
        super();
        this.side = 1;
    }
    public Square(double side)
    {
        super();
        this.side = side;
    }
    public Square(String color, boolean filled, double side)
    {
        super(color, filled, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea()
    {
        return side * side;
    }

    @Override
    public double getPerimetr()
    {
        return 4 * side;
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
