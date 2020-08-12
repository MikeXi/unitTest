package com.epam.tat.module4.testng.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgTest extends BaseCalculatorTest{

    @Test(groups = "double", dataProvider = "valuesForTg")
    public void testTg (double a, double expected){
        double result = calculator.tg(a);
        Assert.assertEquals(result,expected, 0.1);
    }

    @Test(groups = "double")
    public void testTgWithZero(){
        double result = calculator.tg(0);
        Assert.assertTrue(Double.isNaN(result));
    }

    @DataProvider(name = "valuesForTg")
    public Object[][] dataProvider(){
        return new Object[][]{
                {30, 1},
                {45, 1},
                {180, 1},
                {360, 1},
        };
    }
}
