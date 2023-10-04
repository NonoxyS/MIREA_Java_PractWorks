package PractWork_6.task1;

class Cup extends Dish {
    private int volume;

    public Cup(String material, String color, int volume) {
        super(material, color);
        this.volume = volume;
    }

    @Override
    public void use() {
        System.out.println("Пью из чашки объёмом " + volume + " мл");
    }
}