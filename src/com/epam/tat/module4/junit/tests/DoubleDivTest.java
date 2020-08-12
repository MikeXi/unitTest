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
public class DoubleDivTest {
    public static final String CLASS_NAME = DoubleDivTest.class.getSimpleName();
    private double a;
    private double b;
    private double expected;

    private static Calculator cal;

    public DoubleDivTest(double a, double b, double expected){
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
                {6.0, 2.6, 2.3},
                {12.5, 5.6, 2.2},
                {14.3, 1.4, 10.2},
                {2.1, 2.5, 0.8}
        });
    }

    @Test
    public void testDoubleDiv(){
        double result = cal.div(a,b);
        assertEquals(expected,result,0.1);
    }

    @Test
    public void testDivideByZero(){
        double result = cal.div(3.0,0);
        assertTrue(Double.isInfinite(result));
    }
}
