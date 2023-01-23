
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        input(scanner);
        
    }
    
    public static void input(Scanner scanner) {
        ArrayList<String> strings = new ArrayList<>();
        while (true) {
            String text = scanner.nextLine();
            if (text.isEmpty()) {
                break;
            }
            strings.add(text);
            
        }
        
        strings.stream().forEach(value -> System.out.println(value));
        
    }
}
