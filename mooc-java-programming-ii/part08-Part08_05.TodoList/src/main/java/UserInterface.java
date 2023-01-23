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
    private TodoList objects;
    private Scanner scanner;
    
    public UserInterface(TodoList objects, Scanner scanner) {
        this.objects = objects;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("add")) {
                System.out.print("To add: ");
                String add = scanner.nextLine();
                objects.add(add);
                
            }
            
            if (command.equals("list")) {
                objects.print();
            }
            
            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int remove = Integer.valueOf(scanner.nextLine());
                objects.remove(remove);
            }
        }
    }
}
