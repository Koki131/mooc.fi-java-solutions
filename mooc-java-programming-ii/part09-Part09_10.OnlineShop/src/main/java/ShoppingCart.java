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

public class ShoppingCart {
    private List<Item> items;
    
    
    public ShoppingCart() {
        this.items = new ArrayList<>();        
    }
    
    public void add(String product, int price) {
        this.items.add(new Item(product, 0, price));        
    }
    
    public int price(String product) {
        int price = 0;
        for (Item item : items) {
            price = price + item.getPrice();
        }
        return price;
    }
    
    public List<Item> getItems() {
        return this.items;
    }
    
    public int price() {
        int sum = 0;
        for (Item item : items) {
            sum = sum + item.getPrice();
        }
        return sum;       
    }
    
    public int quantity(String product) {
        int times = 0;
        for (Item item : items) {
            if (item.getProduct().equals(product)) {
                times++;
            }
        }
        return times;
    }
    
    public void print() {
        Set<String> keys = new HashSet<>();
        for (Item item : items) {
            keys.add(item.getProduct());
        }
        for (String key : keys) {
            System.out.println(key + ": " + quantity(key));
        }
    }
}
