package us.peaksoft.homeWorkCalculater.models;

import us.peaksoft.homeWorkCalculater.services.ArabicCalc;
import us.peaksoft.homeWorkCalculater.services.impl.ArabicCalcImpl;

public class Main {
    public static void main(String[] args) {

//        ArabicCalc arabicCalc = new ArabicCalcImpl();
//        arabicCalc.calcArabic();

        RomeCalc romeCalc = new RomeCalcExtends();
        romeCalc.calcRome();

    }
}
