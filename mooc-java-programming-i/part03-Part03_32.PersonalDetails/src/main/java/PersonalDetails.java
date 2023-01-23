
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        int total = 0;
        int longest = 0;
        String longestName = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] names = input.split(",");
            for (int i = 0; i < names.length; i++) {
                sum = sum + Integer.valueOf(names[1]);
                total = total + 1;
                avg = 1.0 * sum / total;
                if (longest < Integer.valueOf(names[0].length())) {
                    longest = Integer.valueOf(names[0].length());
                    longestName = names[0];
                }
            }
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + avg);

    }
}
