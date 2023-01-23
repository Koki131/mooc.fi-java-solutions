
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        while (!(input.equals("halted") || input.equals("") || input.equals(" "))) {
            for (int i = 0; i < words.length; i++) {
                System.out.println(words[i]);
                
            }
            input = scanner.nextLine();
            words = input.split(" ");
            if (input.equals("halted") || input.equals("") || input.equals(" ")) {
                break;
            }
        }
           
   }
}