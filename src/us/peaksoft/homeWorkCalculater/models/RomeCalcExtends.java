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
        char operation;
        String result = null;
        convertToArabNumbers(String.valueOf(romeNumbers));
        convertToRomeNumbers(arabNumbers);
        a = scanner.nextLine();
        operation = scanner.next().charAt(0);
        b = scanner.nextLine();
        a = a.toUpperCase();
        b = b.toUpperCase();


        getResOfRomNum(operation);


        return result;
    }


    public int convertToArabNumbers(String num) {
        int resC = 0;
        if (num.equals(romeNumbers[0]))
            resC = 1;
        else if (num.equals(romeNumbers[1]))
            resC = 2;
        else if (num.equals(romeNumbers[2]))
            resC = 3;
        else if (num.equals(romeNumbers[3]))
            resC = 4;
        else if (num.equals(romeNumbers[4]))
            resC = 5;
        else if (num.equals(romeNumbers[5]))
            resC = 6;
        else if (num.equals(romeNumbers[6]))
            resC = 7;
        else if (num.equals(romeNumbers[7]))
            resC = 8;
        else if (num.equals(romeNumbers[8]))
            resC = 9;
        else if (num.equals(romeNumbers[9]))
            resC = 10;
        return resC;
    }

    public String convertToRomeNumbers(int... numF) {

        String conStr = null;

        for (int i = 0; i < numF.length; i++) {
            if (numF[i] == 1) {
                conStr = romeNumbers[0];
            } else if (numF[i] == 2) {
                conStr = romeNumbers[1];
            } else if (numF[i] == 3) {
                conStr = romeNumbers[2];
            } else if (numF[i] == 4) {
                conStr = romeNumbers[3];
            } else if (numF[i] == 5) {
                conStr = romeNumbers[4];
            } else if (numF[i] == 6) {
                conStr = romeNumbers[5];
            } else if (numF[i] == 7) {
                conStr = romeNumbers[6];
            } else if (numF[i] == 8) {
                conStr = romeNumbers[7];
            } else if (numF[i] == 9) {
                conStr = romeNumbers[8];
            } else if (numF[i] == 10) {
                conStr = romeNumbers[9];
            } else {
                conStr = "";
            }
        }
        return conStr;
    }

    public String getResOfRomNum(char operation) {
        String resS = "";
        switch (operation) {
            case '+':
                resS = romeNumbers[9];
                break;
            case 2:
                resS = romeNumbers[9] + romeNumbers[9];
                break;
            case 3:
                resS = romeNumbers[9] + romeNumbers[9] + romeNumbers[9];
                break;
            case 4:
                resS = romeNumbers[9] + "L";
                break;
            case 5:
                resS = "L";
                break;
            case 6:
                resS = "L" + romeNumbers[9];
                break;
            case 7:
                resS = "L" + romeNumbers[9] + romeNumbers[9];
                break;
            case 8:
                resS = "L" + romeNumbers[9] + romeNumbers[9] + romeNumbers[9];
                break;
            case 9:
                resS = romeNumbers[9] + "C";
            case 10:
                resS = "C";
        }
//        resS += convertToRomeNumbers(operation);

        return resS;
    }
}