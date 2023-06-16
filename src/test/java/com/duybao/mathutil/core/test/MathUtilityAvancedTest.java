package com.duybao.mathutil.core.test;

import com.duybao.mathutil.core.MathUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MathUtilityAvancedTest {

    public static Object[][] initTestData() {
        Object testData[][] = {{1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}};
        return testData;
    }

    @ParameterizedTest
    @MethodSource(value = "initTestData")
    public void testFactorialGivenRightArgumentReturnWell(int n, long expected){
        Assertions.assertEquals(expected, MathUtility.getFactorial(n));
    }
}
