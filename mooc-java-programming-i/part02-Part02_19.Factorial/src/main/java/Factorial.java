
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        int factorial = 1;
        for (int n = 1; n <= number; n++) {
            factorial = factorial * n;
        }
        System.out.println("Factorial: " + factorial);
    }
}
