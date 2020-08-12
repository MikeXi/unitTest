package com.epam.tat.module4.testng.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class LongMultTest extends BaseCalculatorTest{

    @Test(groups = "long", dataProvider = "valuesForLongMult")
    public void testLongMult (long a, long b, long expected){
        long result = calculator.mult(a, b);
        Assert.assertEquals(result,expected);
    }

    @DataProvider(name = "valuesForLongMult")
    public Object[][] dataProvider(){
        return new Object[][]{
                {1, 2, 2},
                {2, 5, 10},
                {3, 4, 12},
                {5, 0, 0}
        };
    }

}
