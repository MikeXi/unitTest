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
public class PowTest {
    public static final String CLASS_NAME = PowTest.class.getSimpleName();
    private double a;
    private double b;
    private double expected;

    private static Calculator cal;

    public PowTest(double a, double b, double expected){
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
                {-3.0, 3, -27},
                {2.5, 3, 15.6},
                {5, 5, 3125},
                {2.1, 0, 1}
        });
    }

    @Test
    public void testPow(){
        double result = cal.pow(a,b);
        assertEquals(expected,result,0.1);
    }
}
