package us.peaksoft.practices.models;

/**
 * Created by Alsalam on 03.02.2021.
 */
// эски женерик класс
public class OldGeneric {
    private Object object;

    public OldGeneric(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return object + " ";
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
