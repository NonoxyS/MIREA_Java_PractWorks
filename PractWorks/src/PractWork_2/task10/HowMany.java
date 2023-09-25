package PractWork_2.task10;

public class HowMany {
    public static void main(String[] args) {
        int wordCount = 0;
        for (String arg : args)
        {
            if (arg.matches(".*[a-zA-Z].*"))
                wordCount++;
        }
        System.out.println("Word count: " + wordCount);
    }
}

