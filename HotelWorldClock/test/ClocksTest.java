import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ClocksTest {

    @Test
    void testUpdate() {
        Clocks clocks = new Clocks();
        LocalTime phoneTime = LocalTime.parse("08:00");
        clocks.update(phoneTime);
        assertAll(
                ()->assertEquals("08:00:00", clocks.Beijing.getTime()),
                ()->assertEquals("00:00:00", clocks.London.getTime()),
                ()->assertEquals("04:00:00", clocks.Moscow.getTime()),
                ()->assertEquals("10:00:00", clocks.Sydney.getTime()),
                ()->assertEquals("19:00:00", clocks.NewYork.getTime())
        );
    }

}