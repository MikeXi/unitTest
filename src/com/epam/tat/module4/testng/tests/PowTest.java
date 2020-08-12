package com.epam.tat.module4.testng.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowTest extends BaseCalculatorTest{

    @Test(groups = "double", dataProvider = "valuesForPow")
    public void testPow (double a, double b, double expected){
        double result = calculator.pow(a,b);
        Assert.assertEquals(result,expected, 0.1);
    }

    @DataProvider(name = "valuesForPow")
    public Object[][] dataProvider(){
        return new Object[][]{
                {-3.0, 3, -27},
                {2.5, 3, 15.6},
                {5, 5, 3125},
                {2.1, 0, 1}
        };
    }
}
