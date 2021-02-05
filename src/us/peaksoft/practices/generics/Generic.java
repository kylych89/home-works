package us.peaksoft.practices.generics;

/**
 * Created by Alsalam on 03.02.2021.
 */
// женерик класс
public class Generic <T1, T2>{
    private T1 key;
    private T2 value;

    public Generic(T1 key, T2 value) {
        this.key = key;
        this.value = value;
    }

    public <T> void print() {
        System.out.println("key: " + key + "\nvalue:" + value);
    }

    public T1 getKey() {
        return key;
    }

    public void setKey(T1 key) {
        this.key = key;
    }

    public T2 getValue() {
        return value;
    }

    public void setValue(T2 value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return key + " " + value + " ";
    }

}
