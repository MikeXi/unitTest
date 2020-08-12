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
public class IsNegativeTest {
    public static final String CLASS_NAME = IsNegativeTest.class.getSimpleName();
    private long a;

    private static Calculator cal;

    public IsNegativeTest(long a){
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
        return Arrays.asList(new Object[]{2, 0});
    }

    @Test
    public void testIsNegitive(){
        boolean result = cal.isNegative(-4);
        assertTrue(result);
    }

    @Test
    public void testIsNotNegative(){
        boolean result = cal.isNegative(a);
        assertFalse(result);
    }
}
