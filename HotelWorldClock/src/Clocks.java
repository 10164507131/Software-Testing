import java.time.LocalTime;

public class Clocks {
    protected Clock Beijing;
    protected Clock London;
    protected Clock Moscow;
    protected Clock Sydney;
    protected Clock NewYork;
    public Clocks() {
        Beijing = new Clock(8);
        London = new Clock(0);
        Moscow = new Clock(4);
        Sydney = new Clock(10);
        NewYork = new Clock(-5);
    }
    public void update(LocalTime phoneTime){
        Beijing.updateTime(phoneTime);
        London.updateTime(phoneTime);
        Moscow.updateTime(phoneTime);
        Sydney.updateTime(phoneTime);
        NewYork.updateTime(phoneTime);
    }
    public void printTime() {
        System.out.println("北京: " + Beijing.getTime());
        System.out.println("伦敦: " + London.getTime());
        System.out.println("莫斯科: " + Moscow.getTime());
        System.out.println("悉尼: " + Sydney.getTime());
        System.out.println("纽约: " + NewYork.getTime());
    }
}
