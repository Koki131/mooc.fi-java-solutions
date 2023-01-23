
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        // implement here a program that reads user input
        // until the user enters 9999
        while (true) {
            int nums = Integer.valueOf(scanner.nextLine());
            if (nums == 9999) {
                break;
            }
            list.add(nums);
        }
        System.out.println("");
        
        int smallest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("Smallest number: " + smallest);
        for (int n = 0; n < list.size(); n++) {
            if (list.get(n) == smallest) {
                System.out.println("Found at index: " + n);
            }
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        
    }
}
