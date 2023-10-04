package PractWork_6.task1;

class Plate extends Dish {
    private int diameter;

    public Plate(String material, String color, int diameter) {
        super(material, color);
        this.diameter = diameter;
    }

    @Override
    public void use() {
        System.out.println("Ем из тарелки с диаметром " + diameter + " см");
    }
}