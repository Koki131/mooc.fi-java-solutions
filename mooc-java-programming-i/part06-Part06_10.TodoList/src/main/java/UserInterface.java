/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author milapetrov
 */
import java.util.Scanner;

public class UserInterface {
    private TodoList instance;
    private Scanner scanner;
    
    public UserInterface(TodoList instance, Scanner scanner) {
        this.instance = instance;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else {
                printCommands(command);
            }
        }
    }
    
    public void printCommands(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("list")) {
            list();
        } else if (command.equals("remove")) {
            remove();
        }
    }
    
    
    public void add() {
        System.out.print("To add: ");
        String add = scanner.nextLine();
        instance.add(add);
    }
    
    public void list() {
        instance.print();
    }
    
    public void remove() {
        System.out.print("Which one is removed? ");
        int remove = Integer.valueOf(scanner.nextLine());
        instance.remove(remove);
    }
}
