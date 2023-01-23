
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("How many random numbers should be printed?");
        int num = Integer.valueOf(scanner.nextLine());
       
        for (int n = 0; n < num; n++) {
            int randomNum = rand.nextInt(11);
            System.out.println(randomNum);
        }
        
        
    }

}
