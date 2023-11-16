package PractWork_15.task2;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeHourlyRate(double rate) {
        model.setHourlyRate(rate);
    }

    public void setEmployeeHourlyWorked(int hours) {
        model.setHoursWorked(hours);
    }

    public void setName(String name) {
        model.setName(name);
    }

    public void updateView() {
        view.printEmployeeDetails(model);
    }
}