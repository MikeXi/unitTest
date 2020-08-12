package com.epam.tat.module4.testng.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class IsNegativeTest extends BaseCalculatorTest{

    @Test(groups = "boolean", dependsOnGroups = "double")
    public void testIsNegitive(){
        checkTime();
        boolean result = calculator.isNegative(-4);
        Assert.assertTrue(result);
    }

    @Test(groups = "boolean", dataProvider = "valuesForIsNegative", dependsOnGroups = "double")
    public void testIsNotNegative(long a){
        checkTime();
        boolean result = calculator.isNegative(a);
        Assert.assertFalse(result);
    }

    @DataProvider(name = "valuesForIsNegative")
    public Object[] dataProvider(){
        return new Object[]{2, 0};
    }
}
