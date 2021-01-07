package us.peaksoft.homeWorkCalculater.models;

public interface RomanToInteger {
    static int romanToArabic(String a, String b) {
        a = a.toUpperCase();
        b = b.toUpperCase();

        if (a.equals("I")) {
            a = Integer.toString(1);
        } else if (a.equals("II")) {
            a = Integer.toString(2);
        } else if (a.equals("III")) {
            a = Integer.toString(3);
        } else if (a.equals("IV")) {
            a = Integer.toString(4);
        } else if (a.equals("V")) {
            a = Integer.toString(5);
        } else if (a.equals("VI")) {
            a = Integer.toString(6);
        } else if (a.equals("VII")) {
            a = Integer.toString(7);
        } else if (a.equals("VIII")) {
            a = Integer.toString(8);
        } else if (a.equals("IX")) {
            a = Integer.toString(9);
        } else if (a.equals("X")) {
            a = Integer.toString(10);
        }

        if (b.equals("I")) {
            b = Integer.toString(1);
        } else if (b.equals("II")) {
            b = Integer.toString(2);
        } else if (b.equals("III")) {
            b = Integer.toString(3);
        } else if (b.equals("IV")) {
            b = Integer.toString(4);
        } else if (b.equals("V")) {
            b = Integer.toString(5);
        } else if (b.equals("VI")) {
            b = Integer.toString(6);
        } else if (b.equals("VII")) {
            b = Integer.toString(7);
        } else if (b.equals("VIII")) {
            b = Integer.toString(8);
        } else if (b.equals("IX")) {
            b = Integer.toString(9);
        } else if (b.equals("X")) {
            b = Integer.toString(10);
        }

        return Integer.parseInt(a + b);
    }
}
