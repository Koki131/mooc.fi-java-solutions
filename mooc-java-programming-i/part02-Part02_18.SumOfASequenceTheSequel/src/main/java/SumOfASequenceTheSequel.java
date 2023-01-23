
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number? ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int last = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int n = first;
        while (n <= last) {
            sum = 0;
            n++;
            sum = sum + n;
            
        }
        System.out.println(sum);
             
    }
}
