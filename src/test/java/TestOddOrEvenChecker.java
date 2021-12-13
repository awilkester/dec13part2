package test.java;

import main.java.OddOrEven;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class TestOddOrEvenChecker {
    private static OddOrEven oddOrEven;

    @BeforeAll
    public static void setup(){
        oddOrEven = new OddOrEven();
    }
    @ParameterizedTest(name = "test odd number with: {arguments} ")
    @ValueSource(ints = {25, 15})
    public void testOddNumber(int number) {
        assertTrue(oddOrEven.isOddNumber(number));
    }

    @ParameterizedTest(name = "test odd number with: {arguments} ")
    @ValueSource(ints = {20, 10})
    public void testEvenNumber(int number) {
        assertFalse(oddOrEven.isOddNumber(number));
    }

    @AfterAll
    public static void takedown(){
        oddOrEven = null;
    }
}
