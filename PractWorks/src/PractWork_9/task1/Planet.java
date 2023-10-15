package PractWork_9.task1;

public class Planet implements Nameable {
    private String name;
    private int diametr;

    public Planet(String name, int diametr) {
        this.name = name;
        this.diametr = diametr;
    }

    @Override
    public String getName() {
        return String.format("Planet: %s\nDiametr: %d KM", name, diametr);
    }
}