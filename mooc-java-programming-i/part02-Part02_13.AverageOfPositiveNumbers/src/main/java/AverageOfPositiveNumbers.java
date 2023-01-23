
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int total = 0;
        double avg = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } else if (number > 0) {
                sum = sum + number;
                total = total + 1;
                avg = 1.0 * sum / total;
             
            }
        }
        if (sum <= 0) {
            System.out.println("Cannot calculate average");
        } else {
            System.out.println(avg);
        }
    }
}
