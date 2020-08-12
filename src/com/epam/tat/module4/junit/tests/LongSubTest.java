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
public class LongSubTest {
    public static final String CLASS_NAME = LongSubTest.class.getSimpleName();
    private long a;
    private long b;
    private long expected;

    private static Calculator cal;

    public LongSubTest(long a, long b, long expected){
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
                {1, 2, -1},
                {2, 5, -3},
                {10, 4, 6},
                {15, 2, 13}
        });
    }

    @Test
    public void testLongSub(){
        long result = cal.sub(a, b);
        assertEquals(expected,result);
    }
}
