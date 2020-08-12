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
public class SqrtTest {
    public static final String CLASS_NAME = SqrtTest.class.getSimpleName();
    private double a;
    private double expected;

    private static Calculator cal;

    public SqrtTest(double a, double expected){
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
                {-4.0, 2},
                {0, 0},
                {9, 3},
                {14.5, 3.8}
        });
    }

    @Test
    public void testSqrt(){
        double result = cal.sqrt(a);
        assertEquals(expected,result,0.1);
    }
}
