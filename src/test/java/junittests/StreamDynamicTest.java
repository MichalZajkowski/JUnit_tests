package junittests;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StreamDynamicTest {

    private final List<String> in = new ArrayList<>(Arrays.asList("0", "1", "2"));
    private final List<String> out = new ArrayList<>(Arrays.asList("Zero", "One", "Two"));

    @TestFactory
    Stream<DynamicTest> converterDynamicTest() {
        return in.stream().map(sign -> DynamicTest.dynamicTest("Test converter " + sign, () -> {
            int id = in.indexOf(sign);
            assertEquals(out.get(id), converter(sign));
        }));
    }



    private String converter(String sign) {
        return switch (sign) {
            case "0" -> "Zero";
            case "1" -> "One";
            case "2" -> "Two";
            default -> "Error";
        };
    }
}
