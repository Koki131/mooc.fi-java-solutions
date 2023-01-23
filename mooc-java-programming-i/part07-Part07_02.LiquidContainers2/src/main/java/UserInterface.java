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
    private final Container container;
    private final Scanner scan;
    
    public UserInterface(Container container, Scanner scan) {
        this.container = container;
        this.scan = scan;
    }
    
    public void start() {
        Container first = new Container();
        Container second = new Container();
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: "+ second);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] split = input.split(" ");
            String command = split[0];
            int value = Integer.valueOf(split[1]);
            if (command.equals("add") && value > 0) {
                first.add(value);
                if (first.contains() < 100) {
                    first.add(value);
                }
                if (first.contains() > 100) {
                    first.setValue(100);
                }
            }
            
            if (command.equals("move")) {
                
                
                if (first.contains() - value < 0) {
                    second.add(value);
                    first.setValue(0);
                } else {
                    second.add(value);
                    first.remove(value);
                }
                
                if (second.contains() > 100) {
                    second.setValue(100);
                }
                
                
            }
            
            if (command.equals("remove") && value > 0) {
                if (second.contains() - value > 0) {
                    second.remove(value);
                } else {
                    second.setValue(0);
                }
            }
            

        }
    }
}
