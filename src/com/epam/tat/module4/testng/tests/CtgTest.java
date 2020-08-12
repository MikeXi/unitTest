package com.epam.tat.module4.testng.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class CtgTest extends BaseCalculatorTest{

    @Test(groups = "double", dataProvider = "valuesForCtg")
    public void testCtg (double a, double expected){
        double result = calculator.ctg(a);
        Assert.assertEquals(result,expected, 0.1);
    }

    @DataProvider(name = "valuesForCtg")
    public Object[][] dataProvider(){
        return new Object[][]{
                {30, 1},
                {45, 1},
                {180, 1},
                {360, 1},
                {0, 0}
        };
    }
}
