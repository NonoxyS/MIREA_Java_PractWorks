package PractWork_6.task3;

class FurnitureShop {
    private String name;

    public FurnitureShop(String name) {
        this.name = name;
    }

    public void displayFurnitureInfo(Furniture furniture) {
        System.out.println("Добро пожаловать в " + name + "!");
        System.out.println("Информация о мебели:");
        furniture.displayInfo();
        System.out.println();
    }
}