
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int total = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number > 0) {
                sum = sum + number;
                total = total + 1;
                avg = 1.0 * sum / total;
            }
            if (number > 0 && number % 2 == 0) {
                even = even + 1;
            } else if (number > 0 && number % 2 != 0) {
                odd = odd + 1;
            }
            if (number == -1) {
                break;
            }
            
        }
        
        System.out.println("Thx!Bye!");
        System.out.println("Sum:" + sum);
        System.out.println("Numbers: " + total);
        System.out.println("Average:" + avg);
        System.out.println("Even:" + even);
        System.out.println("Odd:" + odd);

    }
}
