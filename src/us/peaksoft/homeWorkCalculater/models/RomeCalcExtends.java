package us.peaksoft.homeWorkCalculater.models;

import java.util.Scanner;

public class RomeCalcExtends extends RomeCalc {

    Scanner scanner = new Scanner(System.in);

    String[] romeNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    int[] arabNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Override
    public String calcRome() {
        System.out.println("ENTER ROME NUMBER: ");
        String a, b;
        char operation = 0;
        String result;

        a = scanner.next();
        operation = scanner.next().charAt(0);
        b = scanner.next();
        a = a.toUpperCase();
        b = b.toUpperCase();
        convertToArabNumbers(a);
        convertToArabNumbers(b);
//        convertToRomeNumbers(Integer.parseInt(a));
//        convertToRomeNumbers(Integer.parseInt(b));

        result = a + b;
        System.out.println(result);


        return result;
    }


    public int convertToArabNumbers(String num) {
        int resArabNumbers = 0;
        if (num.equals(romeNumbers[0])) {
            resArabNumbers = 1;
        } else if (num.equals(romeNumbers[1])) {
            resArabNumbers = 2;
        } else if (num.equals(romeNumbers[2])) {
            resArabNumbers = 3;
        } else if (num.equals(romeNumbers[3])) {
            resArabNumbers = 4;
        } else if (num.equals(romeNumbers[4])) {
            resArabNumbers = 5;
        } else if (num.equals(romeNumbers[5])) {
            resArabNumbers = 6;
        } else if (num.equals(romeNumbers[6])) {
            resArabNumbers = 7;
        } else if (num.equals(romeNumbers[7])) {
            resArabNumbers = 8;
        } else if (num.equals(romeNumbers[8])) {
            resArabNumbers = 9;
        } else if (num.equals(romeNumbers[9])) {
            resArabNumbers = 10;
        }
        return resArabNumbers;
    }

    public String convertToRomeNumbers(int num) {
        String conStr = "";
        if (num == 1) {
            conStr = romeNumbers[0];
        } else if (num == 2) {
            conStr = romeNumbers[1];
        } else if (num == 3) {
            conStr = romeNumbers[2];
        } else if (num == 4) {
            conStr = romeNumbers[3];
        } else if (num == 5) {
            conStr = romeNumbers[4];
        } else if (num == 6) {
            conStr = romeNumbers[5];
        } else if (num == 7) {
            conStr = romeNumbers[6];
        } else if (num == 8) {
            conStr = romeNumbers[7];
        } else if (num == 9) {
            conStr = romeNumbers[8];
        } else if (num == 10) {
            conStr = romeNumbers[9];
        }
        return conStr;
    }

//    public String getResOfRomNum(char operation) {
//        String resS = "";
//        switch (operation) {
//            case '+':
//                resS = arabNumbers[0] + romeNumbers[0];
//                break;
//            case '-':
//                resS = arabNumbers[1] - romeNumbers[1];
//                break;
//            case '/':
//                resS = arabNumbers[0] / romeNumbers[0];
//                break;
//            case '*':
//                resS = arabNumbers[0] * romeNumbers[0];
//                break;
//        }
//        resS += convertToRomeNumbers(operation);
//
//        return resS;
//    }
}