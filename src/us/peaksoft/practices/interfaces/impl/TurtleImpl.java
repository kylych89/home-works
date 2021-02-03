package us.peaksoft.practices.interfaces.impl;

import us.peaksoft.practices.interfaces.Swimmable;

/**
 * Created by Alsalam on 03.02.2021.
 */
// Swimmable интерфейсти имплимент кылган класстар
public class TurtleImpl implements Swimmable {
    @Override
    public void voice() {
        System.out.println("Turtle is brrr brrr");
    }

    @Override
    public void swimm() {
        System.out.println("Turtle is swimming");
    }
}
