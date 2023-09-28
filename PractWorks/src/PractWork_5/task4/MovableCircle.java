package PractWork_5.task4;

public class MovableCircle implements Movable {
    private MovablePoint center;
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String ToString()
    {
        return String.format("Point" +
                "\n(%d, %d)" +
                "\nxSpeed: %d" +
                "\nySpeed: %d" +
                "\nRadius: %d", center.x, center.y, center.xSpeed, center.ySpeed, radius);
    }

    @Override
    public void MoveUp() {center.MoveUp();}

    @Override
    public void MoveDown() {center.MoveDown();}

    @Override
    public void MoveRight() {center.MoveRight();}

    @Override
    public void MoveLeft() {center.MoveLeft();}
}
