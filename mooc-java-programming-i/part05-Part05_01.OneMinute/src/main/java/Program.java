
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here
        ClockHand seconds = new ClockHand(60);
        ClockHand hunSec = new ClockHand(100);
        Timer timer = new Timer();
        
        while (true) {
            System.out.println(timer);
            timer.advance();
        }
        

    }
}
