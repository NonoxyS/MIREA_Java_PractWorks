package PractWork_5.task5;

import PractWork_5.task4.MovableCircle;

public class Main {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(-3, 3, 0, 0, 1, 1);
        System.out.println(rectangle.ToString());
        rectangle.MoveUp();
        System.out.println("\n" + rectangle.ToString());
    }
}
