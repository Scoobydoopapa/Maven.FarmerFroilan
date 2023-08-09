package com.zipcodewilmington.froilansfarm.livingThings;

import com.zipcodewilmington.froilansfarm.designation.Edible;
import com.zipcodewilmington.froilansfarm.foodStuff.EarOfCorn;

import java.util.List;

public class Horse extends Animal<EarOfCorn> {
    public Horse(String name) {
        super(name);
    }
    @Override
    public void eat(EarOfCorn... food) {

    }

    @Override
    public List getListOfFoodEaten() {
        return null;
    }

    @Override
    public String makeNoise() {
        return null;
    }
}
