package PractWork_5.task4;

public class Main {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(2, 5, 1, 1, 1);

        System.out.println(circle.ToString());
        circle.MoveUp();
        System.out.println("\n" + circle.ToString());
    }
}
