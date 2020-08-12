package com.epam.tat.module4.testng.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class DoubleDivTest extends BaseCalculatorTest{

    @Test(groups = "double", dataProvider = "valuesForDoubleDiv", dependsOnMethods = "testDivideByZero")
    public void testDoubleDiv (double a, double b, double expected){
        double result = calculator.div(a, b);
        Assert.assertEquals(result,expected, 0.1);
    }

    @Test(groups = "double")
    public void testDivideByZero(){
        double result = calculator.div(3.0,0);
        Assert.assertTrue(Double.isInfinite(result));
    }

    @DataProvider(name = "valuesForDoubleDiv")
    public Object[][] dataProvider(){
        return new Object[][]{
                {6.0, 2.6, 2.3},
                {12.5, 5.6, 2.2},
                {14.3, 1.4, 10.2},
                {2.1, 2.5, 0.8}
        };
    }
}
