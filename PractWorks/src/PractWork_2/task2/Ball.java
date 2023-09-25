package PractWork_2.task2;

public class Ball {
    private double x, y;

    public Ball()
    {
        x = 0.0;
        y = 0.0;
    }
    public Ball(double x, double y)
    {
        this.x = x;
        this.y = y;
    }



    public double getX() {return x;}
    public double getY() {return y;}

    public void setX(double x) {this.x = x;}
    public void setY(double y) {this.y = y;}

    public void move(double xDisp, double yDisp)
    {
        x += xDisp;
        y += yDisp;
    }

    public String toString()
    {
        return "Pos X: " + x
                + "\nPos Y: " + y;
    }
}
