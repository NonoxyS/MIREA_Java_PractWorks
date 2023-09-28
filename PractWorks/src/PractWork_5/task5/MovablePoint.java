package PractWork_5.task5;

public class MovablePoint implements Movable {
     int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String ToString()
    {
        return String.format("Circle" +
                "\n(%d, %d)" +
                "\nxSpeed: %d" +
                "\nySpeed: %d", x, y, xSpeed, ySpeed);
    }
    @Override
    public void MoveUp() {y += ySpeed;}

    @Override
    public void MoveDown() {y -= ySpeed;}

    @Override
    public void MoveRight() {x += xSpeed;}

    @Override
    public void MoveLeft() {x -= xSpeed;}
}
