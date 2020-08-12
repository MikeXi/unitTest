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
public class DoubleMultTest {
    public static final String CLASS_NAME = DoubleMultTest.class.getSimpleName();
    private double a;
    private double b;
    private double expected;

    private static Calculator cal;

    public DoubleMultTest(double a, double b, double expected){
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
                {1.0, 2.6, 2.6},
                {2.5, 5.6, 14},
                {3.3, 1.4, 4.62},
                {2.1, 2.5, 5.25},
                {2.1, 0, 0}
        });
    }

    @Test
    public void testDoubleMult(){
        double result = cal.mult(a,b);
        assertEquals(expected,result,0.01);
    }
}
