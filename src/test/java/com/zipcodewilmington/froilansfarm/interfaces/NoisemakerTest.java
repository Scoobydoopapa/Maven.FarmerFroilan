package com.zipcodewilmington.froilansfarm.interfaces;


import com.zipcodewilmington.froilansfarm.livingThings.Animal;
import com.zipcodewilmington.froilansfarm.livingThings.Chicken;
import org.junit.Assert;
import org.junit.Test;

public class NoisemakerTest {


    @Test
    public void isNoiseMakerTest() {
        Animal chicken = new Chicken("Gertrude");
        Assert.assertTrue(chicken instanceof Noisemaker);
    }
    @Test
    public void chickenNoiseTest() {
        Chicken chicken = new Chicken("Gertrude");
        String expectedNoise = "Cluck!";
        Assert.assertEquals(expectedNoise, chicken.makeNoise());
    }
}