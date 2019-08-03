package junittests;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StreamDynamicTest {

    private List<String> in = new ArrayList<>(Arrays.asList("0", "1", "2"));
    private List<String> out = new ArrayList<>(Arrays.asList("Zero", "One", "Two"));

    @TestFactory
    Stream<DynamicTest> translateDynamicTestsFromStream() {
        return in.stream()
                .map(sign -> DynamicTest.dynamicTest("Test converter " + sign, () -> {
                    int id = in.indexOf(sign);
                    assertEquals(out.get(id), converter(sign));
                }));
    }

    private String converter(String sign) {
        if ("0".equalsIgnoreCase(sign)) {
            return "Zero";
        } else if ("1".equalsIgnoreCase(sign)) {
            return "One";
        } else if ("2".equalsIgnoreCase(sign)) {
            return "Two";
        }
        return "Error";
    }
}
