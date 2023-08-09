package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.designation.Edible;

public interface Produce<Food extends Edible> {
    Food yield();
    boolean hasbeenFertiized();
}
