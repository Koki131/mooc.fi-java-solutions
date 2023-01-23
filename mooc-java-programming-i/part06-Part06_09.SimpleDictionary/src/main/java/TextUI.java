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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary objects;
    
    public TextUI(Scanner scanner, SimpleDictionary objects) {
        this.scanner = scanner;
        this.objects = objects;
    }
    
    public void start() {
        while (true) {
           System.out.print("Command: ");
           String command = scanner.nextLine();
           if (command.equals("end")) {
               System.out.println("Bye bye!");
               break;
           }
           processCommand(command);      
        }
    }
    
    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("search")) {
            search();
        } else {
            unknown();
        }
    }
    
    public void add() {
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();
        objects.add(word, translation);
        
    }
    
    public void search() {
        System.out.print("To be translated: ");
        String translate = scanner.nextLine();
        if (!(objects.translate(translate) == null)) {
            System.out.println(objects.translate(translate));
        } else {
            System.out.println("Word " + translate + " was not found");
        }
    }
    
    public void unknown() {
        System.out.println("Unknown command");
    }

    
    
}
