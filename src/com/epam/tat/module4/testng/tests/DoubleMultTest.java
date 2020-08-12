package com.epam.tat.module4.testng.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class DoubleMultTest extends BaseCalculatorTest{

    @Test(groups = "double", dataProvider = "valuesForDoubleMult")
    public void testDoubleMult(double a, double b, double expected){
        double result = calculator.mult(a, b);
        Assert.assertEquals(result,expected, 0.0);
    }

    @DataProvider(name = "valuesForDoubleMult")
    public Object[][] dataProvider(){
        return new Object[][]{
                {1.0, 2.6, 2},
                {2.5, 5.6, 14},
                {3.3, 1.4, 4},
                {2.1, 2.5, 5},
                {2.1, 0, 0}
        };
    }

}
