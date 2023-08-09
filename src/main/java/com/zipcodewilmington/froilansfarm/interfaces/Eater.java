package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.designation.Edible;

import java.util.List;

public interface Eater <Food extends Edible>{
    void eat(Food... food);
    List<Food> getListOfFoodEaten();
}
