package PractWork_6.task1;

abstract class Dish {
    String material, color;

    public Dish(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public abstract void use();

    public void wash() {
        System.out.println("Мою посуду, сделанную из " + material);
    }
}