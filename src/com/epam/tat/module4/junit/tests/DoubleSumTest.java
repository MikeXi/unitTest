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
public class DoubleSumTest {
    public static final String CLASS_NAME = DoubleSumTest.class.getSimpleName();
    private double a;
    private double b;
    private double expected;

    private static Calculator cal;

    public DoubleSumTest(double a, double b, double expected){
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
                {1.0, 2.6, 3.6},
                {2.5, 5.6, 8.1},
                {3.3, 1.4, 4.7},
                {5.2, 2.8, 8.0}
        });
    }

    @Test
    public void testDoubleSum(){
        double result = cal.sum(a,b);
        assertEquals(expected,result,0.1);
    }
}
