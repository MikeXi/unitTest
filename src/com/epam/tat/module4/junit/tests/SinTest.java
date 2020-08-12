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
public class SinTest {
    public static final String CLASS_NAME = SinTest.class.getSimpleName();
    private double a;
    private double expected;

    private static Calculator cal;

    public SinTest(double a, double expected){
        this.a = a;
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
                {0,0},
                {30, -0.98},
                {45, 0.85},
                {180, -0.8},
                {360, 0.95}
        });
    }

    @Test
    public void testSin(){
        double result = cal.sin(a);
        assertEquals(expected,result,0.01);
    }

}
