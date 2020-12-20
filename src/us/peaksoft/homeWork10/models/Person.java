package us.peaksoft.homeWork10.models;

public class Person extends World {

    private String name;
    private int age;

    public Person(String days, double workTime, double launchTime, double lessonTime, String meaning, String name, int age) {
        super(days, workTime, launchTime, lessonTime, meaning);
        this.name = name;
        this.age = age;
    }
}