package com.epam.tat.module4.testng.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtTest extends BaseCalculatorTest{

    @Test(groups = "double", dataProvider = "valuesForSqrt")
    public void testSqrt (double a, double expected){
        double result = calculator.sqrt(a);
        Assert.assertEquals(result,expected, 0.1);
    }

    @DataProvider(name = "valuesForSqrt")
    public Object[][] dataProvider(){
        return new Object[][]{
                {-4.0, 2},
                {0, 0},
                {9, 3},
                {14.5, 3.8}
        };
    }
}
