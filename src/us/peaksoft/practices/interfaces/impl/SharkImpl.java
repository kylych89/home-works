package us.peaksoft.practices.interfaces.impl;

import us.peaksoft.practices.interfaces.Swimmable;

/**
 * Created by Alsalam on 03.02.2021.
 */
// Swimmable интерфейсти имплимент кылган класстар
public class SharkImpl implements Swimmable {
    public void attack() {
        System.out.println("Shark is attacking");
    }

    @Override
    public void voice() {
        System.out.println("Shark is brrr brrr");
    }

    @Override
    public void swimm() {
        System.out.println("Shark is swimming");
    }
}
