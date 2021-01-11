package us.peaksoft.homeWorkCalculater.servicesArabCalc.impl;

import us.peaksoft.homeWorkCalculater.exceptions.InputMismatchException;
import us.peaksoft.homeWorkCalculater.servicesArabCalc.ArabicCalc;

import java.util.Scanner;

public class ArabicCalcImpl implements ArabicCalc {
    @Override
    public int calcArabic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter arabic number:");
        int a, b;
        char operation;
        int result;

        a = scanner.nextInt();
        operation = scanner.next().charAt(0);
        b = scanner.nextInt();

        switch (operation) {
            case '+':
                result = a + b;
                System.out.println(result);
                break;
            case '-':
                result = a - b;
                System.out.println(result);
                break;
            case '/':
                result = a / b;
                System.out.println(result);
                break;
            case '*':
                result = a * b;
                System.out.println(result);
                break;
            default:
                throw new InputMismatchException("Error: Invalid operator 404");
        }
        return result;
    }
}