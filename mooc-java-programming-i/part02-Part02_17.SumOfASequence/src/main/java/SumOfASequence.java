
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Last number? ");
        int number = Integer.valueOf(scanner.nextLine());
        int n = 0;
        while (n < number) {
            n++;
            sum = sum + n;
        }
        System.out.println("The sum is: " + sum);
    }
}
