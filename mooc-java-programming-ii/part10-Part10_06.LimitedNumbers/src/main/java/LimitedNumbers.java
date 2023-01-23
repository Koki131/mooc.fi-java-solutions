
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        input(scanner);
    }
    
    public static void input(Scanner scanner) {
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            
            numbers.add(number);
        }
        numbers.stream().filter(i -> i >= 1 && i <= 5).forEach(i -> System.out.println(i));
        
    }
}
