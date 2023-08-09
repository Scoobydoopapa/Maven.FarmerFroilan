package com.zipcodewilmington.froilansfarm.livingThings;

import com.zipcodewilmington.froilansfarm.designation.Botanist;
import com.zipcodewilmington.froilansfarm.designation.CropRow;
import com.zipcodewilmington.froilansfarm.designation.Edible;
import com.zipcodewilmington.froilansfarm.foodStuff.CornStalk;

import com.zipcodewilmington.froilansfarm.foodStuff.EdibleEgg;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;
import org.junit.Assert;
import org.junit.Test;

public class livingThingTest {

    @Test
    public void chickenIsProduceTest() {
        Chicken chicken = new Chicken("Gertrude");
        Assert.assertTrue(chicken instanceof Produce);
    }
    @Test
    public void chickenUnfertilizedYieldTest() {
        Chicken chicken = new Chicken("Gertrude");
        chicken.fertilize();
        Assert.assertNull(chicken.yield());
    }
    @Test
    public void chickenFertilizedYieldTest() {
        Chicken chicken = new Chicken("Gertrude");
        Edible foodYield = chicken.yield();
        Assert.assertNotNull(foodYield);
        Assert.assertTrue(foodYield instanceof EdibleEgg);
    }
    @Test
    public void FarmerPersonTest() {
        Farmer farmer = new Farmer("Old MacDonald");
        Assert.assertTrue(farmer instanceof Person);
    }
    @Test
    public void PersonAnimalTest() {
        Person person = new Farmer("Old MacDonald");
        Assert.assertTrue(person instanceof Animal);
    }
    @Test
    public void FarmerBotanistTest() {
        Farmer farmer = new Farmer("Froilan");
        Assert.assertTrue(farmer instanceof Botanist);
    }
    @Test
    public void PlantTest() {
        Farmer farmer = new Farmer("Froilan");
        CropRow<CornStalk> cornStalkCropRow = new CropRow<CornStalk>();
        CornStalk cornStalk = new CornStalk();
        farmer.plant(cornStalkCropRow, cornStalk);

    }

}
