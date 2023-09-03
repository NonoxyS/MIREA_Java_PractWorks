package Works.pract1_3;

public class Main {
    public static void main(String[] args)
    {
        int i = 1;
        for (String arg: args)
        {
            System.out.printf("Argument %d: %s \n", i, arg);
            i++;
        }
    }
}
