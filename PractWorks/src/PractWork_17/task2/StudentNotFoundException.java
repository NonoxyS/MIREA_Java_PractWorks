package PractWork_17.task2;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}