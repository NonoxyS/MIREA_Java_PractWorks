package PractWork_16.task5;

public class ThrowsDemo {
    public static void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            System.out.println("Key: " + key);
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        getDetails(null);
    }
}