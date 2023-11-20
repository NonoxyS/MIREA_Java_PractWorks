package PractWork_16.task6;

public class ThrowsDemo {
    public static void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }
    public static String getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
            return "";
        }
        return "data for " + key;
    }
    public static void main(String[] args) {
        printMessage("123");
    }
}