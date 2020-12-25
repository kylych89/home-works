package us.peaksoft.homeWork10.models;

public class Accountant {
    private String name;
    private double percent;

    public Accountant(String name, double percent) {
        this.name = name;
        this.percent = percent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public Employee countSalary(Employee employee) {
        double percent = employee.getDaysCount() * employee.getSalaryOfDay() * this.percent / 100;
        double salary = employee.getDaysCount() * employee.getSalaryOfDay() * (100 - this.percent) / 100;
        employee.setPercentValue(percent);
        employee.setSalary(salary);
        return employee;
    }
}
