package PractWork_6.task1;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate("керамики", "белый", 20);
        plate.use();
        plate.wash();

        Cup cup = new Cup("стекла", "синий", 300);
        cup.use();
        cup.wash();
    }
}