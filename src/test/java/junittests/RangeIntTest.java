package junittests;

import junit.RangeInt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RangeIntTest {

    @Test
    @DisplayName("Single test successful")
    void number50IsInRange(){
        RangeInt rangeInt = new RangeInt(0,100);
        Assertions.assertTrue(rangeInt.isInRange(50));
    }
}
