
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics stats = new Statistics();
        UserInterface UI = new UserInterface(stats, scanner);
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        UI.start();
        
    }
}
