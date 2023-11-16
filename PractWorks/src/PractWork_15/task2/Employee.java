package PractWork_15.task2;

public class Employee {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public String getName() {
        return name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
