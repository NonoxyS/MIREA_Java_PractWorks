package PractWork_9.task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Subaru Impreza WRX STI", 30000);
        System.out.println("Model: " + car.getName() +
                "\nPrice: " + car.getPrice() + "$");

        Food food = new Food("Curd", 3.99);
        System.out.println("\nName: " + food.getName() +
                "\nPrice: " + food.getPrice() + "$");

        Furniture furniture = new Furniture("Chair", 49.99);
        System.out.println("\nName: " + furniture.getName() +
                "\nPrice: " + furniture.getPrice() + "$");
    }
}
