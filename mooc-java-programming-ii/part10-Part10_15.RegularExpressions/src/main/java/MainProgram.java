import java.util.*;

public class MainProgram {
    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Checker checker = new Checker();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        checker.timeOfDay(string);
        checker.printTime(string);
    }
}
