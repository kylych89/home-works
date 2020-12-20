package us.peaksoft.homeWork10.models;

public abstract class World {
    private String days;
    private double workTime;
    private double launchTime;
    private double lessonTime;
    private String meaning;


    public World(String days, double workTime, double launchTime, double lessonTime, String meaning) {
        this.days = days;
        this.workTime = workTime;
        this.launchTime = launchTime;
        this.lessonTime = lessonTime;
        this.meaning = meaning;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public double getWorkTime() {
        return workTime;
    }

    public void setWorkTime(double workTime) {
        this.workTime = workTime;
    }

    public double getLaunchTime() {
        return launchTime;
    }

    public void setLaunchTime(double launchTime) {
        this.launchTime = launchTime;
    }

    public double getLessonTime() {
        return lessonTime;
    }

    public void setLessonTime(double lessonTime) {
        this.lessonTime = lessonTime;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}