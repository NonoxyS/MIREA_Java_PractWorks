package PractWork_6.task3;

class Chair extends Furniture {
    private int numberOfLegs;

    public Chair(String name, double price, int numberOfLegs) {
        super(name, price);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public void displayInfo() {
        System.out.println("Мебель: " + getName());
        System.out.println("Цена: " + getPrice() + " Руб");
        System.out.println("Количество ножек: " + numberOfLegs);
    }
}