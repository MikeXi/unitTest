package com.epam.tat.module4.testng.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongSubTest extends BaseCalculatorTest{

    @Test(groups = "long", dataProvider = "valuesForLongSub")
    public void testLongSub(long a, long b, long expected){
        long result = calculator.sub(a, b);
        Assert.assertEquals(result,expected);
    }

    @DataProvider(name = "valuesForLongSub")
    public Object[][] dataProvider(){
        return new Object[][]{
                {1, 2, -1},
                {2, 5, -3},
                {10, 4, 6},
                {15, 2, 13}
        };
    }

}
