package PractWork_4.task1;

public class Circle {
    private double radius;
    private double PI = Math.PI;

    public Circle() {radius = 1;}
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public void setRadius(double radius) {this.radius = radius;}

    public double getSquare() {return PI * radius * radius;}

    public double getLength() { return 2 * PI * radius;}

    public double getDiametr() {return 2 * radius;}

    public String ToString()
    {
        return String.format("Радиус: %.4f" +
                "\nДиаметр: %.4f" +
                "\nПлощадь окружности: %.4f" +
                "\nДлина окружности: %.4f", radius, getDiametr(), getSquare(), getLength());
    }
}
