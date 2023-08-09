package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.designation.CropRow;
import com.zipcodewilmington.froilansfarm.foodStuff.CornStalk;
import com.zipcodewilmington.froilansfarm.foodStuff.TomatoPlant;
import com.zipcodewilmington.froilansfarm.livingThings.Farmer;
import com.zipcodewilmington.froilansfarm.storingThings.FarmField;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplicationTest {

    @Test
    public void fieldStoreCrowTest() {
        FarmField farmField = new FarmField();
        CropRow<CornStalk> cornStalkCropRow = new CropRow<CornStalk>();
        CropRow<TomatoPlant> tomatoPlantCropRow = new CropRow<TomatoPlant>();
        Assert.assertTrue(farmField.add(cornStalkCropRow) && farmField.add(cornStalkCropRow));
    }
}
