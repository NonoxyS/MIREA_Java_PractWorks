package PractWork_6.task3;

public class Main {
    public static void main(String[] args) {
        FurnitureShop furnitureShop = new FurnitureShop("OBI");

        Chair chair = new Chair("Деревянный стул", 1999.99, 4);
        furnitureShop.displayFurnitureInfo(chair);

        Table table = new Table("Круглый деревянный стол", 8999.99, 6);
        furnitureShop.displayFurnitureInfo(table);
    }
}