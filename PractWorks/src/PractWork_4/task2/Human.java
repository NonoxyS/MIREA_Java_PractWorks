package PractWork_4.task2;

public class Human {

    private Head head;
    private Leg[] legs;
    private Hand[] hands;

    public Human(Head head, Leg[] legs, Hand[] hands) {
        this.head = head;
        this.legs = legs;
        this.hands = hands;
    }

    public void move() {
        for (Leg leg : legs)
        {
            leg.walk();
        }
    }

    public void wave() {
        for (Hand hand : hands)
        {
            hand.wave();
        }
    }

    public void talk()
    {
        head.talk();
    }

    public void talk(String line)
    {
        head.talk(line);
    }
}