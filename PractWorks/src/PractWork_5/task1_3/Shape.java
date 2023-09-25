package PractWork_5.task1_3;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape()
    {
        color = "black";
        filled = false;
    }
    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public abstract double getArea();

    public abstract double getPerimetr();

    public abstract String ToString();
}
