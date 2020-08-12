package com.epam.tat.module4.testng.tests;


import com.epam.tat.module4.Calculator;
import com.epam.tat.module4.Timeout;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.Date;

public class BaseCalculatorTest {
    protected Calculator calculator;
    protected String className = this.getClass().getSimpleName();

    @BeforeClass(groups = {"double","boolean","long"})
    public void setUp(){
        System.out.println("Initialize the Calculator instance for Class: " + className + "\r");
        calculator = new Calculator();
    }

    @AfterClass(groups = {"double","boolean","long"})
    public void tearDown(){
        System.out.println("Complete the testing for Class: " + className + "\r");
    }

    public void checkTime(){
        System.out.println("Current time: " + new Date(System.currentTimeMillis()));
        Timeout.sleep(2);
    }
}
