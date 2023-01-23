/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author milapetrov
 */
import java.util.*;

public class UI {
    private Scanner scanner;
    private ArrayList<Integer> numbers;
    
    public UI(Scanner scanner) {
        this.scanner = scanner;
        this.numbers = new ArrayList<>();
    }
    
    public void start() {
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number > 0) {
                numbers.add(number);
            }
            if (number == 0) {
                average();
                break;
            }
            
        }
    }
    
    public void average() {
        int sum = 0;
        int count = 0;
        double average = 0;
        for (Integer number : numbers) {
            sum = sum + number;
            count++;
        }
        if (sum <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            average = 1.0 * sum / count;
            System.out.println(average);
        }
        
        
    }
}
