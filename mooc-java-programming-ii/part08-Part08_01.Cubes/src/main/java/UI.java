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
    
    public UI(Scanner scanner) {
        this.scanner = scanner;
        
    }
    
    
    public void start() {
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            }
            
            int number = Integer.valueOf(command);
            System.out.println(cube(number));
        }
        
    }
    
    public int cube(int number) {
        int cube = number * number * number;
        
        return cube;
    }
}
