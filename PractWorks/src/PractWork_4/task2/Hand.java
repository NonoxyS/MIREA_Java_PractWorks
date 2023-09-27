package PractWork_4.task2;

public class Hand {

    private boolean isRight;

    public Hand(boolean isRight) {
        this.isRight = isRight;
    }

    public void wave() {
        System.out.println("Я махаю " + (isRight ? "правой" : "левой") + " рукой");
    }
}
