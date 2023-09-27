package PractWork_4.task2;

public class Main {
    public static void main(String[] args)
    {
        Head head = new Head("тёмный", "зелёный");

        Leg rightLeg = new Leg(true);
        Leg leftLeg = new Leg(false);
        Leg[] legs = {rightLeg, leftLeg};

        Hand rightHand = new Hand(true);
        Hand leftHand = new Hand(false);
        Hand[] hands = {rightHand, leftHand};

        Human human = new Human(head, legs, hands);

        human.move();
        human.wave();
        human.talk("Я человек");
        human.talk();
    }
}
