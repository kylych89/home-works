package us.peaksoft.homeWorkCalculater.servicesArabCalc;

import us.peaksoft.homeWorkCalculater.servicesArabCalc.impl.ArabicCalcImpl;

public class Main {
    public static void main(String[] args) {
        ArabicCalc arabicCalc = new ArabicCalcImpl();
        arabicCalc.calcArabic();
    }
}
