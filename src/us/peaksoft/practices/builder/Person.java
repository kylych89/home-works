package us.peaksoft.practices.builder;

import java.util.Set;

/**
 * Created by Sayfullah on 05.02.2021.
 */
public class Person {
    private String name;
    private String lastName;
    private int age;
    private double height;
    private double weight;
    private Set<Person> parents;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", parents=" + parents +
                '}';
    }

    public static class Builder {
        private Person person;

        public Builder() {
            person = new Person();
        }

        public Builder withName(String name) {
            person.name = name;
            return this;
        }

        public Builder withLastName(String lastName) {
            person.lastName = lastName;
            return this;
        }

        public Builder withAge(int age) {
            person.age = age;
            return this;
        }

        public Builder withHeight(double height) {
            person.height = height;
            return this;
        }

        public Builder withWeight(double weight) {
            person.weight=weight;
            return this;
        }

        public Builder withParents(Set<Person> parents) {
            person.parents=parents;
            return this;
        }

        public Person build(){
            return person;
        }
    }
}