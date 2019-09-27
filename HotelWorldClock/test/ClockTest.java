import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {

    private Clock clock;
    private LocalTime localTime;
    @BeforeEach
    void init(){
        clock = new Clock(0);
        localTime = LocalTime.parse("08:00");
    }

    @Test
    void testSetUTC() {
        clock.setUTC(localTime);
        assertEquals(LocalTime.parse("00:00"), clock.getUTC());
    }

    @Test
    void testUpdateTime() {
        clock.updateTime(localTime);
        assertEquals("00:00:00", clock.getTime());
        localTime = LocalTime.parse("10:00");
        clock.updateTime(localTime);
        assertEquals("02:00:00", clock.getTime());
    }

    @Test
    void testGetTime() {
        clock.updateTime(localTime);
        assertEquals("00:00:00", clock.getTime());
    }
}