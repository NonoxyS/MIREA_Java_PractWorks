package PractWork_4.task2;

public class Leg {

    private boolean isRight;

    public Leg(boolean isRight) {
        this.isRight = isRight;
    }

    public void walk() {
        System.out.println("Я делаю шаг " + (isRight ? "правой" : "левой") + " ногой");
    }
}