import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        int total = 0;
        while (true) {
            String word = scanner.nextLine();
            if (word.equals("end")) {
                break;
            }
            total = total + 1;
            
        }
        System.out.println(total);
    }
}
