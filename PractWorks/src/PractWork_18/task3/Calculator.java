package PractWork_18.task3;

public class Calculator {
    public static <T extends Number, S extends Number> double sum(T num1, S num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <T extends Number, S extends Number> double subtraction(T num1, S num2) {
        return num1.doubleValue() - num2.doubleValue();
    }

    public static <T extends Number, S extends Number> double multiply(T num1, S num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public static <T extends Number, S extends Number> double divide(T num1, S num2) {
        if (num2.doubleValue() == 0.0)
            throw new IllegalArgumentException("Cannot divide by zero");
        return num1.doubleValue() / num2.doubleValue();
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.sum(1.3, 5));
        System.out.println(calc.subtraction(7, 1.2));
        System.out.println(calc.multiply(7, 7.0));
        System.out.println(calc.divide(14, 2));
    }
}
