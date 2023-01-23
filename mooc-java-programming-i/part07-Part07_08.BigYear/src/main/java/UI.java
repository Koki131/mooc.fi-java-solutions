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
    private ArrayList<Container> birds;
    private Scanner scanner;
    
    public UI(Scanner scanner) {
        this.birds = new ArrayList<>();
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();
            if (command.equals("Quit")) {
                break;
            }
            
            if (command.equals("Add")) {
                addBirb();     
                
            }
            
            if (command.equals("Observation")) {
                observations();
            }
            
            if (command.equals("All")) {
                printAll();
            }
            
            if (command.equals("One")) {
                printOne();
            }
        }
    }
    
    public void printOne() {
        System.out.print("Bird? ");
        String bird = scanner.nextLine();
        for (Container birb : birds) {
            if (bird.equals(birb.getName())) {
                System.out.println(birb);
            }
        }
    }
    
    public void addBirb() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Name in Latin: ");
        String nameInLatin = scanner.nextLine();
        birds.add(new Container(name, nameInLatin));
        
        
      
    }
    
    
    public void observations() {
        System.out.print("Bird? ");
        String bird = scanner.nextLine();
        int count = 0;
        for (Container birb : birds) {
            if (bird.equals(birb.getName())) {
                birb.add();
                count++;
            }            
        }
        if (count < 1) {
            System.out.println("Not a bird!");
        }
        
    }
    
    public void printAll() {
        for (Container bird : birds) {            
            System.out.println(bird);
            
        }
    }
   
    
    
    
}
