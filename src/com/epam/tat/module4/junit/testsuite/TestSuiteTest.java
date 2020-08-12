package com.epam.tat.module4.junit.testsuite;

import com.epam.tat.module4.junit.tests.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                CosTest.class,
                CtgTest.class,
                DoubleDivTest.class,
                DoubleMultTest.class,
                DoubleSubTest.class,
                DoubleSumTest.class,
                IsNegativeTest.class,
                IsPositiveTest.class,
                LongDivTest.class,
                LongMultTest.class,
                LongSubTest.class,
                LongSumTest.class,
                PowTest.class,
                SinTest.class,
                SqrtTest.class,
                TgTest.class,
        }
)
public class TestSuiteTest {

}
