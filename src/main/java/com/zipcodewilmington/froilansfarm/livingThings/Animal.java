package com.zipcodewilmington.froilansfarm.livingThings;

import com.zipcodewilmington.froilansfarm.designation.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Noisemaker;

public abstract class Animal<Food extends Edible> implements Noisemaker, Eater<Food> {
    public Animal(String name) {
    }
}
