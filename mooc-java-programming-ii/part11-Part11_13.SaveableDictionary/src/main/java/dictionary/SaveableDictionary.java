/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author milapetrov
 */
import java.io.*;
import java.nio.file.*;
import java.util.*;


public class SaveableDictionary {
    private Map<String, String> dictionary;
    private String file;
    
    
    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }
        
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }
        
    public void add(String words, String translation) {
        if (!(this.dictionary.containsKey(words))) {
            this.dictionary.put(words, translation);
        }
    }
    
    public String translate(String word) {
          
        for (String key : dictionary.keySet()) {
            if (word.equals(key)) {
                return this.dictionary.get(key);
            } 
            if (word.equals(dictionary.get(key))) {
                return key;
            }
        }       
        return null;        
    }
    
    public void delete(String word) {
        
        String translation = translate(word);
        
        this.dictionary.remove(word);
        this.dictionary.remove(translation);                   
    }
    
    public boolean load() {
        
        try {
            Files.lines(Paths.get(this.file)).map(row -> row.split(":")).forEach(parts -> dictionary.put(parts[0], parts[1]));
                    
            return true;
            
        } catch (Exception e) {
            return false;
        }        
    }
    
    public boolean save()  {
        try (PrintWriter writer = new PrintWriter("word.txt")) {
            for (String key : dictionary.keySet()) {
                writer.println(key + ":" + dictionary.get(key));
            }
            writer.println("");
            writer.println("Cock and ball:torture");
            writer.println("DoDODODO");
            writer.println("I know you like:it");
            writer.close();
            writer.println("DoDODODO");
            
            return true;
  
        } catch (IOException e) {
            return false;
        }       
    }
    
    public void print() {
        System.out.println(dictionary);
    }
}
