package PractWork_2.task6;

public class Circle {
    private double radius, square, length, diametr;
    private double PI = Math.PI;

    public Circle() {}
    public Circle(double radius)
    {
        this.radius = radius;
        square = PI * radius * radius;
        length = 2 * PI * radius;
        diametr = 2 * radius;
    }

    public void setRadius(double radius) {this.radius = radius;}

    public double getSquare() {return square;}

    public String compareCircles(Circle circle_1, Circle circle_2)
    {
        if (circle_1.getSquare() >= circle_2.getSquare())
            return String.format("S(окруж. 1) >= S(окруж. 2) в %.2f раз(а)",
                    circle_1.getSquare() / circle_2.getSquare());

        return String.format("S(окруж. 2) > S(окруж. 1) в %.2f раз(а)",
                circle_2.getSquare() / circle_1.getSquare());
    }

    public String ToString()
    {
        return String.format("Радиус: %.4f" +
                "\nДиаметр: %.4f" +
                "\nПлощадь окружности: %.4f" +
                "\nДлина окружности: %.4f", radius, diametr, square, length);
    }
}
