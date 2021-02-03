package us.peaksoft.practices.models;

/**
 * Created by Alsalam on 03.02.2021.
 */
// статик переменный жана метод
public class Bread {
    static int bread;

    public Bread() {
        bread++;
    }

    public static void printBread() {
        System.out.println(bread);
    }
}
