import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clock {
    private LocalTime time;
    private LocalTime utc;
    private int offset;

    public Clock(int offset){
        this.offset = offset;
        updateTime(LocalTime.now());
    }
    public void setUTC(LocalTime phoneTime) {
        utc = phoneTime.minusHours(8);
    }
    public void updateTime(LocalTime phoneTime) {
        setUTC(phoneTime);
        time = utc.plusHours(offset);
    }
    public String getTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return formatter.format(time);
    }
    public LocalTime getUTC(){
        return utc;
    }

}
