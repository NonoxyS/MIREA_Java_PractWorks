package PractWork_4.task2;

public class Head {

    private String hairColor;
    private String eyesColor;

    public Head(String hairColor, String eyesColor) {
        this.hairColor = hairColor;
        this.eyesColor = eyesColor;
    }

    public void talk()
    {
        System.out.println("У меня " + this.hairColor + " цвет волос" +
                "\nИ " + eyesColor + " цвет глаз");
    }

    public void talk(String line)
    {
        System.out.println("Я говорю: " + line);
    }
}
