package us.peaksoft;

import java.util.Scanner;

/**
 * Created by Sydykov Kylych 21.12.2020
 * for home works!!!
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER ROME NUMBER: ");
        String[] rome = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String a;
        String b;
        String result;

        a = scanner.nextLine();
        b = scanner.nextLine();


        a.equals(rome[0]);
        b.equals(rome[0]);
        result = a+b;
        System.out.println("Result = " + result);


    }
}