package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.livingThings.Animal;
import com.zipcodewilmington.froilansfarm.livingThings.Chicken;
import com.zipcodewilmington.froilansfarm.stuffThatMoves.FarmVehicle;
import com.zipcodewilmington.froilansfarm.stuffThatMoves.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {
    @Test
    public void isNoiseMakerTest() {
        Vehicle vehicle = new Tractor();
        Assert.assertTrue(vehicle instanceof Noisemaker);
    }
    @Test
    public void isRideableTest() {
        Vehicle vehicle = new Tractor();
        Assert.assertTrue(vehicle instanceof Rideable);
    }
    @Test
    public void isFarmVehicleTest() {
        FarmVehicle vehicle = new Tractor();
        Assert.assertTrue(vehicle instanceof Rideable);
    }
}
