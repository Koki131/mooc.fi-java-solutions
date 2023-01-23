
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val1 = Integer.valueOf(scanner.nextLine());
        int val2 = Integer.valueOf(scanner.nextLine());
        System.out.println((int) Math.sqrt(val1 + val2));
    }
}
