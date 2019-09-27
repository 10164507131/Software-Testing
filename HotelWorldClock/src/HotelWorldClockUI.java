import java.time.DateTimeException;
import java.time.LocalTime;
import java.util.Scanner;

public class HotelWorldClockUI {
    private static Phone phone;

    public static void main(String[] args) {
        phone = new Phone();
        Scanner scanner = new Scanner(System.in);
        String lastOption = "";
        while(!lastOption.equalsIgnoreCase("x")){
            lastOption = displayMenu(scanner);
        }
        System.out.println("\n再见......\n");
    }

    private static String displayMenu(Scanner scanner) {
        System.out.println("请选择：");
        System.out.println("1.调整时间");
        System.out.println("2.查看时钟");
        System.out.println("x.退出系统");
        System.out.println("您的选择为：");
        String option = scanner.next();
        switch(option) {
            case "1":
                setPhoneTime();
                return option;
            case "2":
                showTime();
                return option;
            case "x":
                return option;
            default:
                System.out.println("您的输入无效，请重新输入");
                return option;
        }
    }
    private static void setPhoneTime() {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入时间:（HH:mm:ss/HH:mm）");
            try {
                String str = sc.next();
                LocalTime time = LocalTime.parse(str);
                phone.setTime(time);
                break;
            } catch (DateTimeException e) {
                System.out.println("您的输入无效，请重新输入");
            }
        }
    }
    private static void showTime() {
        phone.printTime();
    }
}