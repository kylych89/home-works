package us.peaksoft.home_work10.services;

import us.peaksoft.home_work10.enums.StatusOfDay;
import us.peaksoft.home_work10.models.Employee;
import us.peaksoft.home_work10.models.Schedules;

public class Work implements WorkServiceImpl {
    private String name;
    private String address;
    private StatusOfDay statusOfDay;
    private Schedules schedules;

    public Work(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public StatusOfDay getStatusOfDay() {
        return statusOfDay;
    }

    public void setStatusOfDay(StatusOfDay statusOfDay) {
        this.statusOfDay = statusOfDay;
    }

    public Schedules getSchedules() {
        return schedules;
    }

    public void setSchedules(Schedules schedules) {
        this.schedules = schedules;
    }

    @Override
    public void getWork(Employee employee) {
        StatusOfDay statusOfDay = employee.getStatusOfDay();
        Schedules schedules = new Schedules();
        System.out.println("Hi my name is " + employee.getName());
        System.out.println("I 'm " + employee.getAge() + " years old");
        System.out.println("I 'm a " + employee.getPosition());
        System.out.println("This is what I do in my daily life");
        System.out.println("><><><><");
        switch (statusOfDay) {
            case MONDAY:
                schedules.setDesignation("The first day....\nI come to work at 08:00 am " +
                        "\n12:00-13:00 am lunch time \n18:00 pm I study Java \n21:30 pm I go home.");
                System.out.println(schedules);
                break;
            case TUESDAY:
                schedules.setDesignation("The second day....\nI come to work at 08:00 am \n" +
                        "12:00-13:00 am lunch time \n18:00 pm I study soft skills and English \n21:30 pm go home.");
                System.out.println(schedules);
                break;
            case WEDNESDAY:
                schedules.setDesignation("The third day....\nI come to work at 08:00 am \n" +
                        "12:00-13:00 am lunch time \n18:00 pm I study Java \n21:30 pm I go home");
                System.out.println(schedules);
                break;
            case THURSDAY:
                schedules.setDesignation("On the fourth day...\nI come to work at 08:00 am \n" +
                        "12 00-13:00 am lunchtime \n18:00 pm I study soft skills and English \n21:30 pm I go home");
                System.out.println(schedules);
                break;
            case FRIDAY:
                schedules.setDesignation("On the fifth day, \nI come to work at 08:00 am \n12:00 am to 13:00 am I have lunch \n" +
                        "from 13:15 am to 14:00 am I go to Friday prayer \n18:00 pm I study Java \n21:30 pm I go home");
                System.out.println(schedules);
                break;
            case SATURDAY:
                schedules.setDesignation("Day six....\nI come to work at 08:00 am \n" +
                        "12:00-13:00 am lunch \nI write the code in my free time \nI repeat tasks 18:00 pm I go home");
                System.out.println(schedules);
                break;
            case SUNDAY:
                schedules.setDesignation("On weekends...\nI relax at home, go for a walk with my family,\n" +
                        "repeat lessons in the evening, re-write the code");
                System.out.println(schedules);
                break;
            default:
                System.out.println("Error");
        }
    }
}