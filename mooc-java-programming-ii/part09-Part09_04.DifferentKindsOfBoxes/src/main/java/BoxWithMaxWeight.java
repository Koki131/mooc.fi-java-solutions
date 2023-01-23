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

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
        
    }
    
    @Override
    public void add(Item item) {
        int sum = 0;
        items.add(item);
        for (Item itm : items) {
            sum = sum + itm.getWeight();                        
        }
        if (sum > capacity) {
            items.remove(items.size() - 1);
        }        
    }
    
    @Override
    public boolean isInBox(Item item) {
        if (this.items.contains(item)) {
            return true;
        }
        return false;
    }
    
    public void print() {
        for (Item item : items) {
            System.out.println(item.getName() + ": " + item.getWeight());
        }
    }
    
    
}
