package us.peaksoft.homeWorkCalculater.models;

import us.peaksoft.homeWorkCalculater.services.ArabicCalc;
import us.peaksoft.homeWorkCalculater.services.impl.ArabicCalcImpl;

public class Main {
    public static void main(String[] args) {

//        ArabicCalc arabicCalc = new ArabicCalcImpl();
//        arabicCalc.calcArabic();

        RomeCalc romeCalc = new RomeCalcExtends();
        romeCalc.calcRome();


//        System.out.println(toRoman(5));

    }


    private static String toRoman(int n) {
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "X", "IX", "V", "I"};
        int[] romanNumeralNums = {1000, 900, 500, 400, 100, 90, 50, 10, 9, 5, 1};
        String finalRomanNum = "";

        for (int i = 0; i < romanNumeralNums.length; i++) {
            int currentNum = n / romanNumeralNums[i];
            if (currentNum == 0) {
                continue;
            }

            for (int j = 0; j < currentNum; j++) {
                finalRomanNum += romanNumerals[i];
            }

            n = n % romanNumeralNums[i];
        }
        return finalRomanNum;
    }
}
