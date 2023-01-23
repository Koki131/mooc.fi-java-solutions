
import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(10);
        list.add(24);
        list.add(-14);
        list.add(4);
        list.add(7);
        System.out.println(list);
        // Try your method here
        printNumbersInRange(list, 1, 5);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        System.out.println("The numbers in the range: [" + lowerLimit + ", " + upperLimit + "]");
        for (int n = 0; n < numbers.size() ; n++) {
            if (numbers.get(n) >= lowerLimit && numbers.get(n) <= upperLimit) {
                System.out.println(numbers.get(n));
            }
        }
    }
    
}
