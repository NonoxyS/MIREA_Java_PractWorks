package PractWork_6.task3;

class Table extends Furniture {
    private int numberOfSeats;

    public Table(String name, double price, int numberOfSeats) {
        super(name, price);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void displayInfo() {
        System.out.println("Мебель: " + getName());
        System.out.println("Цена: " + getPrice() + " Руб");
        System.out.println("Количество мест: " + numberOfSeats);
    }
}
