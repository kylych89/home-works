package us.peaksoft.practices.interfaces.impl;

import us.peaksoft.practices.interfaces.Swimmable;

/**
 * Created by Alsalam on 03.02.2021.
 */
// Swimmable интерфейсти имплимент кылган класстар
public class DuckImpl implements Swimmable {

    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void voice() {
        System.out.println("Duck is brrr brrr");
    }

    @Override
    public void swimm() {
        System.out.println("Duck is swimming");
    }

}
