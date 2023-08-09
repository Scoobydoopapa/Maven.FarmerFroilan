package com.zipcodewilmington.froilansfarm.livingThings;

import com.zipcodewilmington.froilansfarm.designation.Edible;
import com.zipcodewilmington.froilansfarm.foodStuff.EarOfCorn;
import com.zipcodewilmington.froilansfarm.foodStuff.EdibleEgg;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

import java.util.List;

public class Chicken extends Animal<EarOfCorn> implements Produce<EdibleEgg> {
    public Chicken(String name) {
        super(name);
    }

    public String makeNoise() {
        return null;
    }


    @Override
    public void eat(EarOfCorn... food) {

    }

    @Override
    public List getListOfFoodEaten() {
        return null;
    }

    @Override
    public EdibleEgg yield() {
        return null;
    }

    @Override
    public boolean hasbeenFertiized() {
        return false;
    }

    public void fertilize() {
    }
}
