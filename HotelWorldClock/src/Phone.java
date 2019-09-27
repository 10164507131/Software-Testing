import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Phone {
    private LocalTime phoneTime;
    protected Clocks clocks;
    public Phone(){
        phoneTime = LocalTime.now();
        clocks = new Clocks();
    }
    public void setTime(LocalTime time){
        phoneTime = time;
        clocks.update(phoneTime);
    }
    public String getTime(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return formatter.format(phoneTime);
    }
    public void printTime() {
        System.out.println("Phone: " + getTime());
        clocks.printTime();
        System.out.println();
    }
}
