/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.*;


/**
 *
 * @author milapetrov
 */
public class Dictionary {
    private List<String> words;
    private Map<String, String> translations;
    
    public Dictionary() {
        this.words = new ArrayList<>();
        this.translations = new HashMap<>();
        
        add("sana", "word");
    }
    
    public String get(String word) {
        return this.translations.get(word);
    }
    
   public List<String> values() {
       return this.words;
   }
    
    public void add(String word, String translation) {
        if (!(this.translations.containsKey(word))) {
            this.words.add(word);
        }
        this.translations.put(word, translation);
    }
    
    public String getRandomWord() {
        Random rand = new Random();
        String word = this.words.get(rand.nextInt(this.words.size()));
        return word;
    }
}
