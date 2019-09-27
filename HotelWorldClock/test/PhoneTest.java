import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class PhoneTest {
    private Phone phone;
    private String nowTime;
    @BeforeEach
    void init(){
        phone = new Phone();
        LocalTime now = LocalTime.now();
        nowTime = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
    @Test
    void testSetTime() {
        phone.setTime(LocalTime.parse("12:00"));
        assertEquals("12:00:00", phone.getTime());
    }

    @Test
    void testGetTime() {
        assertEquals(nowTime, phone.getTime());
        LocalTime time = LocalTime.parse("13:00");
        phone.setTime(time);
        assertEquals("13:00:00", phone.getTime());
    }
}