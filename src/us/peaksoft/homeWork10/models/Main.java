package us.peaksoft.homeWork10.models;

import us.peaksoft.homeWork10.enums.StatusOfDay;
import us.peaksoft.homeWork10.services.Work;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Aibek", 25, "Programmer", 30, 1000);
        Accountant accountant = new Accountant("Gilmira", 15);
        employee = accountant.countSalary(employee);
        System.out.println("name: " + employee.getName());
        System.out.println("age: " + employee.getAge());
        System.out.println("position: " + employee.getPosition());
        System.out.println("how many days he work in one month: " + employee.getDaysCount());
        System.out.println("how much money he took in one day: " + employee.getSalaryOfDay());
        System.out.println("salary: " + employee.getSalary());
        System.out.println("percent: " + employee.getPercentValue());

        System.out.println("________________");


        Employee employee1 = new Employee("Nurbek",30,"Programmer", StatusOfDay.MONDAY);

        Work work = new Work("Salam","Bishkek");
        work.getWork(employee1);
    }
}
