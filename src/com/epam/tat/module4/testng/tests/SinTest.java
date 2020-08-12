package com.epam.tat.module4.testng.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinTest extends BaseCalculatorTest{

    @Test(groups = "double", dataProvider = "valuesForSin")
    public void testSin (double a, double expected){
        double result = calculator.sin(a);
        Assert.assertEquals(result,expected, 0.01);
    }

    @DataProvider(name = "valuesForSin")
    public Object[][] dataProvider(){
        return new Object[][]{
                {0,0},
                {30, -0.98},
                {45, 0.85},
                {180, -0.8},
                {360, 0.95}
        };
    }
}
