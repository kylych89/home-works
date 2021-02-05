package us.peaksoft.practices.generics;

/**
 * Created by Alsalam on 03.02.2021.
 */
// жаны женерик класс
public class NewGeneric <T> {
    private T object;

    public NewGeneric(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return object + " ";
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

}
