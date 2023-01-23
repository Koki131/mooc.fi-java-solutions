
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tax1 = 100;
        int tax2 = 1700;
        int tax3 = 4700;
        int tax4 = 22100;
        int tax5 = 142100;
        System.out.println("Value of the gift:");
        int value = Integer.valueOf(scan.nextLine());
        if (value < 5000) {
            System.out.println("No tax!");
        } else if (value == 5000) {
            System.out.println("Your tax: " + (double) tax1);
        } else if (value > 5000 && value < 25000) {
            System.out.println("Your tax: " + (double) (tax1 + (0.08 * (value - 5000))));
        } else if (value == 25000) {
            System.out.println("Your tax: " + (double) tax2);
        } else if (value > 25000 && value < 55000) {
            System.out.println("Your tax: " + (double) (tax2 + (0.1 * (value - 25000))));
        } else if (value == 55000) {
            System.out.println("Your tax: " + (double) tax3);
        } else if (value > 55000 && value < 200000) {
            System.out.println("Your tax: " + (double) (tax3 + (0.12 * (value - 55000))));
        } else if (value == 200000) {
            System.out.println("Your tax: " + (double) tax4);
        } else if (value > 200000 && value < 1000000) {
            System.out.println("Your tax: " + (double) (tax4 + (0.15 * (value - 200000))));
        } else if (value == 1000000){
            System.out.println("Your tax: " + (double) tax5);
        } else {
            System.out.println("Your tax: " + (double) (tax5 + (0.17 * (value - 1000000))));
        }
        
    }
}
