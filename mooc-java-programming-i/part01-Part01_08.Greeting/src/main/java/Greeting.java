
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        // Write your program here
        String question = scanner.nextLine();
        System.out.println("Hi " + question);

    }
}
