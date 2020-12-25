package us.peaksoft.homeWork10.models;

import us.peaksoft.homeWork10.enums.StatusOfDay;

public class Employee extends Person {
    private String position;
    private double salary;
    private int daysCount;
    private int salaryOfDay;
    private double percentValue;
    private StatusOfDay statusOfDay;

    public Employee(String name, int age, String position, int daysCount, int salaryOfDay) {
        super(name, age);
        this.position = position;
        this.daysCount = daysCount;
        this.salaryOfDay = salaryOfDay;
    }

    public Employee(String name, int age, String position, StatusOfDay statusOfDay) {
        super(name, age);
        this.position = position;
        this.statusOfDay = statusOfDay;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDaysCount() {
        return daysCount;
    }

    public void setDaysCount(int daysCount) {
        this.daysCount = daysCount;
    }

    public int getSalaryOfDay() {
        return salaryOfDay;
    }

    public void setSalaryOfDay(int salaryOfDay) {
        this.salaryOfDay = salaryOfDay;
    }

    public double getPercentValue() {
        return percentValue;
    }

    public void setPercentValue(double percentValue) {
        this.percentValue = percentValue;
    }

    public StatusOfDay getStatusOfDay() {
        return statusOfDay;
    }

    public void setStatusOfDay(StatusOfDay statusOfDay) {
        this.statusOfDay = statusOfDay;
    }
}
