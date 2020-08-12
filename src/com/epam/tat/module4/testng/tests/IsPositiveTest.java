package com.epam.tat.module4.testng.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class IsPositiveTest extends BaseCalculatorTest{

    @Test(groups = "boolean", dependsOnGroups = "long")
    public void testIsPositive(){
        boolean result = calculator.isPositive(4);
        Assert.assertTrue(result);
    }

    @Test(groups = "boolean", dataProvider = "valuesForIsPositive", dependsOnGroups = "long")
    public void testIsNotPositive(long a){
        boolean result = calculator.isPositive(a);
        Assert.assertFalse(result);
    }

    @DataProvider(name = "valuesForIsPositive")
    public Object[] dataProvider(){
        return new Object[]{-2, 0};
    }
}
