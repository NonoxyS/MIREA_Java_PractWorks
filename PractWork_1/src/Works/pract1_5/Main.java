package Works.pract1_5;

import java.util.Scanner;

public class Main {
    //private int factorial(int numb);
    public static void main(String[] args)
    {
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        long number = in.nextInt();
        System.out.printf("Факториал числа %d: %d", number, new Main().factorial(number));
    }
    long factorial(long numb)
    {
        long i = numb;
        while (i > 1)
        {
            i--;
            numb *= i;
        }
        return numb;
    }
}
