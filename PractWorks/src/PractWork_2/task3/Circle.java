package PractWork_2.task3;

public class Circle {
    private double radius;
    private Point center;
    public Circle(Point center, double radius)
    {
        this.center = center;
        this.radius = radius;
    }
    public void setRadius(double radius) {this.radius = radius;}
    public void setX(double x) {center.setX(x);}
    public void setY(double y) {center.setY(y);}
    public String toString() {return String.format("(x, y): (%.2f, %.2f) \nRadius: %.2f",
            center.getX(), center.getY(), radius);}
}
