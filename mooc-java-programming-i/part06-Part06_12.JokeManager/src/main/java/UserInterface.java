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
import java.util.ArrayList;

public class UserInterface {
    private JokeManager instance;
    private Scanner scanner;
    
    public UserInterface(JokeManager instance, Scanner scanner) {
        this.instance = instance;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            } else {
                printCommands(command);
            }
            
        }
    }
    
    public void printCommands(String command) {
        if (command.equals("1")) {
            System.out.println("Write the joke to be added: ");
            String joke = scanner.nextLine();
            instance.addJoke(joke);
        } else if (command.equals("2")) {
            System.out.println(instance.drawJoke());
        } else if (command.equals("3")) {
            instance.printJokes();
        }
    }
    
    
}
