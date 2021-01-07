package us.peaksoft.homeWorkCalculater.models;

import java.util.Scanner;

public class RomeCalcExtends extends RomeCalc {

    Scanner scanner = new Scanner(System.in);

    int[] arab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    String[] rome = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    @Override
    public String calcRome() {
        String a, b;
        char operation;
        String result = null;

        a = scanner.nextLine();
        a = a.toUpperCase();
        operation = scanner.next().charAt(0);
        b = scanner.nextLine();
        b = b.toUpperCase();

        switch (operation){
            case '+':
                result = String.valueOf(RomanToInteger.romanToArabic(a,b));
                System.out.println(result);
        }


        return result;
    }
}