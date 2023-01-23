
import java.util.*;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            
            String[] split = input.split(" ");
            String coom = split[0];
            int number = Integer.valueOf(split[1]);
            
            // adding numbers to first;
            if (coom.equals("add") && number > 0) {
                first = first + number;
                if (first > 100) {
                    first = 100;
                }
            }
            // moving numbers from first to second;
            if (coom.equals("move") && number > 0) {
                if (first < number) {
                    second = second + first;
                    first = 0;
                    
                } else {
                    first = first - number;
                    second = second + number;
                }
                
                if (second > 100) {
                    second = 100;
                }
            }
            // removing numbers from second;
            if (coom.equals("remove") && number > 0) {
                if (second < number) {
                    second = 0;
                } else {
                    second = second - number;
                }
                
                
                
            }
            
            
            
        }
    }

}
