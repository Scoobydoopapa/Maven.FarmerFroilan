package com.zipcodewilmington.froilansfarm.designation;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop<Food extends Edible> implements Produce<Food> {
    boolean hasBeenHarvested;
    boolean isHasBeenFertilized;
    double yieldRate;

    @Override
    public Food yield() {
        return null;
    }

    @Override
    public boolean hasbeenFertiized() {
        return false;
    }
}
