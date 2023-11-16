package PractWork_15.task2;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Employee model = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();

        System.out.println("\nAfter update");
        controller.setEmployeeHourlyRate(300);
        controller.setEmployeeHourlyWorked(176);
        controller.updateView();
    }

    private static Employee retriveEmployeeFromDatabase() {
        Employee employee = new Employee();
        employee.setName("Worker_1");
        employee.setHourlyRate(250);
        employee.setHoursWorked(176);
        return employee;
    }
}