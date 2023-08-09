package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.designation.CropRow;
import com.zipcodewilmington.froilansfarm.foodStuff.CornStalk;
import com.zipcodewilmington.froilansfarm.livingThings.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class ProduceTest {
    @Test
    public void CropRowStoreCropTest() {
        CropRow<CornStalk> cornStalkCropRow = new CropRow<CornStalk>();
        CornStalk cornStalk = new CornStalk();
        Assert.assertTrue(cornStalkCropRow.add(cornStalk));
    }
}
