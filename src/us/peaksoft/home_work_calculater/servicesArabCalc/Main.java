package us.peaksoft.home_work_calculater.servicesArabCalc;

import us.peaksoft.home_work_calculater.servicesArabCalc.impl.ArabicCalcImpl;

public class Main {
    public static void main(String[] args) {
        ArabicCalc arabicCalc = new ArabicCalcImpl();
        arabicCalc.calcArabic();
    }
}
