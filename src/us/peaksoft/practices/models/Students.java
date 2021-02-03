package us.peaksoft.practices.models;

/**
 * Created by Alsalam on 03.02.2021.
 */
// стрим менен иштоо классы
public class Students {

    private Long id;
    private String name;
    private int averageGrade;

    public Students(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Students(Long id, String name, int averageGrade) {
        this.id = id;
        this.name = name;
        this.averageGrade = averageGrade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(int averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }

}
