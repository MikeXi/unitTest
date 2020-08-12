package com.epam.tat.module4.testng.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongSumTest extends BaseCalculatorTest{

    @Test(groups = "long", dataProvider = "valuesForLongSum")
    public void testLongSum(long a, long b, long expected){
        long result = calculator.sum(a, b);
        Assert.assertEquals(result,expected);
    }

    @DataProvider(name = "valuesForLongSum")
    public Object[][] dataProvider(){
        return new Object[][]{
                {1, 2, 3},
                {2, 5, 7},
                {3, 4, 7},
                {5, 8, 13}
        };
    }

}
