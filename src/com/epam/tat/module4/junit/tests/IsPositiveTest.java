package com.epam.tat.module4.junit.tests;
import com.epam.tat.module4.Calculator;
import com.epam.tat.module4.Timeout;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

@RunWith(value = Parameterized.class)
public class IsPositiveTest {
    public static final String CLASS_NAME = IsPositiveTest.class.getSimpleName();
    private long a;

    private static Calculator cal;

    public IsPositiveTest(long a){
        this.a = a;
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
    public static Collection<Object> data(){
        return Arrays.asList(new Object[]{-2, 0});
    }

    @Test
    public void testIsPositive(){
        boolean result = cal.isPositive(4);
        assertTrue(result);
    }

    @Test
    public void testIsNotPositive(){
        boolean result = cal.isPositive(a);
        assertFalse(result);
    }

}
