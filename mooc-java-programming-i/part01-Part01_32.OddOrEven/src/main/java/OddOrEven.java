
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Write your program here 
        // HINT:
        System.out.println("Give a number:");
        int num1 = Integer.valueOf(scan.nextLine());
        if (num1 % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
