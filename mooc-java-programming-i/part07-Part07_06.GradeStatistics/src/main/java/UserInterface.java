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
public class UserInterface {
    private Statistics numbers;
    private Scanner scanner;
    
    public UserInterface(Statistics numbers,Scanner scanner) {
        this.numbers = numbers;
        this.scanner = scanner;
    }
    
    public void start() {
        
        System.out.println("Enter point totals, -1 stops: ");
        while (true) {
            int points = Integer.valueOf(scanner.nextLine());
            if (points == -1) {
                break;
            }
            if (points >= 0 && points <= 100) {
                numbers.add(points);
            }
            
           
            
        }
        System.out.println("Point average (all): " + numbers.average());
        numbers.avgOfPassing();
        System.out.println("Pass percentage: " + numbers.passPercent());
        for (int c = 5; c >= 0; c--) {
            System.out.println(c + ": " + numbers.print(c));
        }
        
            
    }
}
