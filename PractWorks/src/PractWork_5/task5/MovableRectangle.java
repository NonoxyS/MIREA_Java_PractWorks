package PractWork_5.task5;

public class MovableRectangle implements Movable {
    private MovablePoint TopLeftDot, BottomRightDot;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        TopLeftDot = new MovablePoint(x1, y1, xSpeed, ySpeed);
        BottomRightDot = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean isSameSpeed()
    {
        return (TopLeftDot.xSpeed == BottomRightDot.xSpeed && TopLeftDot.ySpeed == BottomRightDot.ySpeed);
    }

    @Override
    public void MoveUp()
    {
        TopLeftDot.MoveUp();
        BottomRightDot.MoveUp();
    }

    @Override
    public void MoveDown()
    {
        TopLeftDot.MoveDown();
        BottomRightDot.MoveDown();
    }

    @Override
    public void MoveLeft()
    {
        TopLeftDot.MoveLeft();
        BottomRightDot.MoveLeft();
    }

    @Override
    public void MoveRight()
    {
        TopLeftDot.MoveRight();
        BottomRightDot.MoveRight();
    }

    public String ToString()
    {
        return String.format("Rectangle" +
                "\nTopLeftDot (%d, %d)" +
                "\nBottomRightDot (%d, %d)" +
                "\nxSpeed: %d" +
                "\nySpeed: %d", TopLeftDot.x, TopLeftDot.y, BottomRightDot.x,
                BottomRightDot.y, TopLeftDot.xSpeed, TopLeftDot.ySpeed);
    }
}
