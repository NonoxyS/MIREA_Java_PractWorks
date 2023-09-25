package PractWork_2.task2;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Start x: ");
        double x = in.nextDouble();
        System.out.print("Start y: ");
        double y = in.nextDouble();

        Ball ball_object1 = new Ball(x, y);
        Ball ball_object2 = new Ball();

        System.out.println("\nBall 1 pos\n" + ball_object1.toString());
        System.out.println("\nBall 2 pos\n" + ball_object2.toString());
    }
}
