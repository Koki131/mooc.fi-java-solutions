
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val1 = Integer.valueOf(scanner.nextLine());
        int val2 = Integer.valueOf(scanner.nextLine());
        if (val1 > val2) {
            System.out.println(val1 + " is greater than " + val2);
        } else if (val1 < val2) {
            System.out.println(val1 + " is smaller than " + val2);
        } else {
            System.out.println(val1 + " is equal to " + val2);
        }
    }
}
