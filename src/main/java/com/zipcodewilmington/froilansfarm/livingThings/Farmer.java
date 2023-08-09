package com.zipcodewilmington.froilansfarm.livingThings;

import com.zipcodewilmington.froilansfarm.designation.Botanist;
import com.zipcodewilmington.froilansfarm.designation.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

import java.util.List;

public class Farmer extends Botanist implements Rider {
    public Farmer(String name) {
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

    @Override
    public void mount(Rideable rideablething) {

    }

    @Override
    public void dismount(Rideable rideablething) {

    }
}
