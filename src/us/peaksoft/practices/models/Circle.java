package us.peaksoft.practices.models;

/**
 * Created by Alsalam on 03.02.2021.
 */
// площадтын квадратын табуу
public class Circle {
    static final double PI = 3.14;

    static double area(double radius) {
        double area;
        area = PI * (radius * radius);
        System.out.println(area);
        return area;
    }

    static double circumference(double radius) {
        double circumference;
        circumference = PI * 2 * radius;
        System.out.println(circumference);
        return circumference;
    }
}
