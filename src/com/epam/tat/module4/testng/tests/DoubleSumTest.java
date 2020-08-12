package com.epam.tat.module4.testng.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class DoubleSumTest extends BaseCalculatorTest{

    @Test(groups = "double", dataProvider = "valuesForDoubleSum")
    public void testDoubleSum(double a, double b, double expected){
        double result = calculator.sum(a, b);
        Assert.assertEquals(result,expected, 0.1);
    }

    @DataProvider(name = "valuesForDoubleSum")
    public Object[][] dataProvider(){
        return new Object[][]{
                {1.0, 2.6, 3.6},
                {2.5, 5.6, 8.1},
                {3.3, 1.4, 4.7},
                {5.2, 2.8, 8.0}
        };
    }

}
