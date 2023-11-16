package PractWork_15.task1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        view.printStudentDetails();

        System.out.println("\nAfter update");
        controller.setStudentName("Geniy");
        controller.setStudentRollNo("02");
        controller.updateView();
        view.printStudentDetails();
    }
    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Botik");
        student.setRollNo("01");
        return student;
    }
}
