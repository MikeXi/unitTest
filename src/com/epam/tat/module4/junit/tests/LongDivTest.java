package com.epam.tat.module4.junit.tests;
import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class LongDivTest {
    public static final String CLASS_NAME = LongDivTest.class.getSimpleName();
    private long a;
    private long b;
    private long expected;

    private static Calculator cal;

    public LongDivTest(long a, long b, long expected){
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @BeforeClass
    public static void setUp() throws Exception{
        System.out.println("Test is started for class: " + CLASS_NAME);
        cal = new Calculator();
    }

    @AfterClass
    public static void tearDown() throws Exception{
        System.out.println("Test is completed for class: " + CLASS_NAME);
    }

    @Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {6, 2, 3},
                {0, 5, 0},
                {3, 2, 1},
                {5, 10, 0}
        });
    }

    @Test
    public void testLongDiv(){
        long result = cal.div(a, b);
        assertEquals(expected,result);
    }

    @Test(expected = NumberFormatException.class)
    public void testDivideByZero(){
        cal.div(3,0);
    }
}
