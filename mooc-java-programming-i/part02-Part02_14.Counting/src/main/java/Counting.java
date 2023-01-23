
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stop = Integer.valueOf(scanner.nextLine());
        for (int n = 0; n <= stop; n++) {
            System.out.println(n);
        }
    }
}
