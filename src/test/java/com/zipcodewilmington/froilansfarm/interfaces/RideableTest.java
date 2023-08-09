package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.livingThings.Animal;
import com.zipcodewilmington.froilansfarm.livingThings.Chicken;
import com.zipcodewilmington.froilansfarm.livingThings.Horse;
import org.junit.Assert;
import org.junit.Test;

public class RideableTest {
    @Test
    public void isNoiseMakerTest() {
        Animal horse = new Horse("Silver");
        Assert.assertTrue(horse instanceof Noisemaker);
    }
    @Test
    public void isRideableTest() {
        Animal horse = new Horse("Silver");
        Assert.assertTrue(horse instanceof Rideable);
    }
}
