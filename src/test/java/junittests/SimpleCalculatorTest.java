package junittests;

import junit.SimpleCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    @DisplayName("Single test successful")
    void whenDivideByValidNumber_thenAssertCorrectResult() {
        double result = SimpleCalculator.divideNumbers(10, 2);
        assertEquals(2, result);
    }

    @Test
    void whenDivideNumbers_thenAssertionFailedError() {
        assertThrows(AssertionFailedError.class, new Executable() {
            public void execute() {
                double result = SimpleCalculator.divideNumbers(5, 2);
                assertEquals(2, result);
            }
        });
    }

    @Test
    void whenDivideByZero_thenAssertException() {
        assertThrows(ArithmeticException.class, new Executable() {
            public void execute() {
                SimpleCalculator.divideNumbers(10, 0);
            }
        });
    }
}
