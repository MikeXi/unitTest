package com.epam.tat.module4.testng.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class CosTest extends  BaseCalculatorTest{

    @Test(groups = "double", dataProvider = "valuesForCos")
    public void testCos( double a, double expected){
        double result = calculator.cos(a);
        Assert.assertEquals(result,expected, 0.01);
    }

    @DataProvider(name = "valuesForCos")
    public Object[][] dataProvider(){
        return new Object[][]{
                {0,1},
                {30, 0.15},
                {45, 0.53},
                {180, -0.6},
                {360, -0.28}
        };
    }
}
