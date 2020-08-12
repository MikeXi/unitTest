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
public class TgTest {
    public static final String CLASS_NAME = TgTest.class.getSimpleName();
    private double a;
    private double expected;

    private static Calculator cal;

    public TgTest(double a, double expected){
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
                {30, 1},
                {45, 1},
                {180, 1},
                {360, 1}
        });
    }

    @Test
    public void testTg(){
        double result = cal.tg(a);
        assertEquals(expected,result,0.1);
    }

    @Test
    public void testTgWithZero(){
        double result = cal.tg(0);
        assertTrue(Double.isNaN(result));
    }
}
