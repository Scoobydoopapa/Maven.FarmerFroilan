package com.zipcodewilmington.froilansfarm.livingThings;

import com.zipcodewilmington.froilansfarm.designation.Edible;

import java.util.List;

public abstract class Person extends Animal<Edible> {
    public Person(String name) {
        super(name);
    }

    @Override
    public void eat(Edible... food) {

    }

    @Override
    public List<Edible> getListOfFoodEaten() {
        return null;
    }

    @Override
    public String makeNoise() {
        return null;
    }
}
