/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author milapetrov
 */
import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    
    public void addItem(Item item) {
       if (this.totalWeight() + item.getWeight() > this.maxWeight) {
           return;
       }
       this.items.add(item);
       
              
        
    }
    
    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int total = 0;
        for (Item item : this.items) {
            total = total + item.getWeight();
        }
        return total;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        for (Item item : this.items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
    
    public String toString() {
        int weight = 0;
        for (Item item : this.items) {
            weight = weight + item.getWeight();            
        }
        
        if (this.items.isEmpty()) {
            return "no items" + " (" + weight + " kg)";
        }
        if (this.items.size() == 1) {
            return "" + this.items.size() + " item " + "(" + weight + " kg)";
        }
        return "" + this.items.size() + " items" + " (" + weight + " kg)";
        
    }
}
