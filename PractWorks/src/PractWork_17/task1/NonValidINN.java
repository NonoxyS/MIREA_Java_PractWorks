package PractWork_17.task1;

public class NonValidINN extends RuntimeException {
    public NonValidINN(String errorMessage) {
        super(errorMessage);
    }
}
