
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        while (!(input.equals("") || input.equals(" "))) {
            String[] split = input.split(" ");
            for (int i = 0; i < split.length; i++) {
                
                if (split[i].contains("av")) {
                    System.out.println(split[i]);   
                }
                
            }
            
            if (input.equals("") || input.equals(" ")) {
                break;
            } else {
                 input = scanner.nextLine();
            }
        }

    }
}
