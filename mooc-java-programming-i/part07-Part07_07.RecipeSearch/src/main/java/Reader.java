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
import java.nio.file.Paths;

public class Reader {
    private ArrayList<String> recipes;
    private ArrayList<String> names;
    private ArrayList<Integer> time;
    private ArrayList<String> ingredients;
    private Scanner scanner;
    
    public Reader(Scanner scanner) {
        this.recipes = new ArrayList<>();
        this.names = new ArrayList<>();
        this.time = new ArrayList<>();
        this.ingredients = new ArrayList<>();
        this.scanner = scanner;
    }
    
    public void recipeSearch() {
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        reader(file);
        
        System.out.println();
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        
        while (true) {   
            System.out.println();
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            System.out.println();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("list")) {
                reader(file);
                System.out.println("Recipes: ");
                for (int n = 0; n < names.size(); n++) {
                    System.out.println(names.get(n) + ", " + "cooking time: " + time.get(n));
                }             
            }
            
            if (command.equals("find name")) {
                byName(file);
            }
            
            if (command.equals("find cooking time")) {
                byTime(file);
            }
            
            if (command.equals("find ingredient")) {
                byIngredient(file);                              
            }
        }        
    }
    
    public void reader(String file) {
        try (Scanner read = new Scanner(Paths.get(file))) {
            while (read.hasNextLine()) {
                String reading = read.nextLine();
               
                if (!recipes.contains(reading)) {
                     recipes.add(reading);                     
                }
                
                
                if (reading.isEmpty() && !(names.contains(recipes.get(0)))) {
                    names.add(recipes.get(0));
                    if (recipes.size() > 2) {
                        time.add(Integer.valueOf(recipes.get(1)));
                    }
                    recipes.clear();                   
                }
                
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    
    
    
    public void byName(String file) {
        recipes.clear();
        System.out.print("Searched word: ");
        String word = scanner.nextLine();
        System.out.println();
        System.out.println("Recipes: ");
        for (int n = 0; n < names.size(); n++) {
            if (names.get(n).contains(word)) {
                System.out.println(names.get(n) + ", cooking time: " + time.get(n));
            } 
        }
    }
    
    public void byTime(String file) {
        recipes.clear();
        System.out.print("Max cooking time: ");
        int max = Integer.valueOf(scanner.nextLine());
        System.out.println();
        System.out.println("Recipes: ");
        for (int n = 0; n < names.size(); n++) {
            if (time.get(n) <= max) {
                System.out.println(names.get(n) + ", cooking time: " + time.get(n));
            }
        }
    }
    
    public void byIngredient(String file) {
        recipes.clear();
        System.out.print("Ingredient: ");
        String ing = scanner.nextLine();
        
        System.out.println();
        System.out.println("Recipes: ");
        try (Scanner read = new Scanner(Paths.get(file))) {
            while (read.hasNextLine()) {
                String reading = read.nextLine();
                
                if (!recipes.contains(reading)) {
                    recipes.add(reading);
                    
                }
                
                if (ing.equals(reading)) {
                    System.out.println(recipes.get(0) + ", cooking time: " + recipes.get(1));
                        
                }
                
                if (reading.isEmpty()) {
                    recipes.clear();
                
                }
            }
            
                    
                    
                    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }   
}   

