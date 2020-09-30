package junittests;

import junit.SimpleCalculator;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void whenDivideByValidNumber_thenAssertCorrectResult() {
        double result = SimpleCalculator.divideNumbers(10, 2);
        assertEquals(5, result);
    }

    @Test
    void whenDivideNumbers_thenAssertionFailedError() {
        assertThrows(AssertionFailedError.class, () -> {
            double result = SimpleCalculator.divideNumbers(5, 2);
            assertEquals(2, result);
        });
    }

    @Test
    void whenDivideByZero_thenAssertException() {
        assertThrows(ArithmeticException.class, () -> SimpleCalculator.divideNumbers(10, 0));
    }
}
