package com.epam.tat.module4.testng.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgTest extends BaseCalculatorTest{

    @Test(groups = "double", dataProvider = "valuesForTg")
    public void testTg (double a, double expected){
        double result = calculator.tg(a);
        Assert.assertEquals(result,expected, 0.01);
    }

    @DataProvider(name = "valuesForTg")
    public Object[][] dataProvider(){
        return new Object[][]{
                {30, -6.4},
                {180, 1.34},
                {360, -3.38},
                {0,0}
        };
    }
}
