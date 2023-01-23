
import java.util.Scanner;
import java.util.Arrays;
public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int sum = 0;
        int sumSecond = 0;
        while (true) {
             
             System.out.println("First: " + sum + "/100");
             System.out.println("Second: " + sumSecond + "/100");
             
          
            
            System.out.print("> ");
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] elements = input.split(" ");
            String command = elements[0];
            int value1 = Integer.valueOf(elements[1]);
            if (input.contains("add")) {
                if (value1 > 0) {
                    sum = sum + value1;
                }
                if (sum > 100) {
                    sum = 100;
                }
                if (value1 > 100) {
                    sum = 100;
                }
            }
            if (command.equals("move")) {
                if (sum >= value1 && value1 > 0) {
                    sum = sum - value1;
                    sumSecond = sumSecond + value1;
                } else {
                    sumSecond = sumSecond + sum;
                    sum = 0;
                }
                if (sumSecond > 100) {
                    sumSecond = 100;
                }
                
                
                
                
            }
            
            if (command.equals("remove")) {
                if (sumSecond >= 0) {
                    sumSecond = sumSecond - value1;
                }
                if (sumSecond < 0) {
                    sumSecond = 0;
                }
            }
        }        
    }
}           