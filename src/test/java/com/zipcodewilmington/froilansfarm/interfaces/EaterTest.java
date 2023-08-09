package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.foodStuff.EarOfCorn;
import com.zipcodewilmington.froilansfarm.livingThings.Animal;
import com.zipcodewilmington.froilansfarm.livingThings.Chicken;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class EaterTest {
    @Test
    public void AnimalEaterTest() {
        Animal chicken = new Chicken("Gertrude");
        Assert.assertTrue(chicken instanceof Eater);
    }
    @Test
    public void FeedChickenTest() {
        EarOfCorn earOfCorn = new EarOfCorn();
        Chicken chicken = new Chicken("Gertrude");
        List<EarOfCorn> whatWeAte = chicken.getListOfFoodEaten();
    }

}
