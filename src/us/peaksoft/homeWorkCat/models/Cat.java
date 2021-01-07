package us.peaksoft.homeWorkCat.models;

import us.peaksoft.homeWorkCat.exceptions.MyException;

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (getName() == null) {
            throw new MyException(name + "Нулл болушу мумкун эмес!!!");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
