package us.peaksoft.homeWorkCalculater.models;

import java.util.Scanner;

public class RomeCalcExtends extends RomeCalc {
    Scanner scanner = new Scanner(System.in);

    String[] arab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    String[] rome = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    @Override
    public int calcRome() {
        String a, b;
        char operation;
        String result = null;

        a = scanner.nextLine();
        operation = scanner.next().charAt(0);
        b = scanner.nextLine();

        switch (operation){
            case '+':
                System.out.println(a);
        }

        return Integer.parseInt(result);
    }
}