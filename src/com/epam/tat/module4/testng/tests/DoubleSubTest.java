package com.epam.tat.module4.testng.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class DoubleSubTest extends BaseCalculatorTest{

    @Test(groups = "double", dataProvider = "valuesForDoubleSub")
    public void testDoubleSub(double a, double b, double expected){
        double result = calculator.sub(a, b);
        Assert.assertEquals(result,expected, 0.1);
    }

    @DataProvider(name = "valuesForDoubleSub")
    public Object[][] dataProvider(){
        return new Object[][]{
                {1.0, 2.6, -1.6},
                {8.5, 5.6, 2.9},
                {3.3, 1.3, 2.0},
                {5.2, 2.8, 2.4}
        };
    }

}
