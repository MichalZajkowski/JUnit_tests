package junittests;

import org.junit.jupiter.api.Test;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class JUnitTests {

    @Test
    void streamOfNumberShouldBeGreaterThen5() {
        assertTrue(Stream.of(0, 1, 2, 3, 4).mapToInt(i -> i).sum() > 5);
    }

    @Test
    void assertArray() {
        int[] numbers = {0, 1, 2, 3, 4};
        assertAll(
                () -> assertEquals(numbers[1], 1),
                () -> assertEquals(numbers[2], 2),
                () -> assertEquals(numbers[3], 3),
                () -> assertEquals(numbers[4], 4)
        );
    }

    @Test
    void shouldThrowException() {
        Throwable exception = assertThrows(UnsupportedOperationException.class, () -> {
            throw new UnsupportedOperationException("Not supported");
        });
        assertEquals(exception.getMessage(), "Not supported");
    }

    @Test
    void assertThrowsException() {
        String str = "";
        assertThrows(IllegalArgumentException.class, () -> {
            Integer.valueOf(str);
        });
    }
}
