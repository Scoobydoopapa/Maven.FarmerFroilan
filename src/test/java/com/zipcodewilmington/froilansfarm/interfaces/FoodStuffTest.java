package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.designation.Edible;
import com.zipcodewilmington.froilansfarm.foodStuff.EarOfCorn;
import org.junit.Assert;
import org.junit.Test;

public class FoodStuffTest {
    @Test
    public void cornIsEdibleTest() {
        EarOfCorn earOfCorn = new EarOfCorn();
        Assert.assertTrue(earOfCorn instanceof Edible);
    }

}
