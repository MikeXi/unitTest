package com.epam.tat.module4.testng.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class LongDivTest extends BaseCalculatorTest{

    @Test(groups = "long", dataProvider = "valuesForLongDiv", dependsOnMethods = "testDivideByZero")
    public void testLongDiv (long a, long b, long expected){
        long result = calculator.div(a, b);
        Assert.assertEquals(result,expected);
    }

    @Test(groups = "long", expectedExceptions = NumberFormatException.class)
    public void testDivideByZero(){
        calculator.div(3,0);
    }

    @DataProvider(name = "valuesForLongDiv")
    public Object[][] dataProvider(){
        return new Object[][]{
                {6, 2, 3},
                {0, 5, 0},
                {3, 2, 1},
                {5, 10, 0}
        };
    }
}
