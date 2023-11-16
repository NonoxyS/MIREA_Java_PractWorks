package PractWork_15.task2;

public class EmployeeView {
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Employee");
        System.out.println("Name: " + employee.getName());
        System.out.println("Horly Rate: " + employee.getHourlyRate() + " Руб.");
        System.out.println("Hours Worked: " + employee.getHoursWorked());
        System.out.println("Salary: " + employee.calculateSalary() + " Руб.");
    }
}
