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

public class Item {
    private String product;
    private int quantity;
    private int price;
    
    public Item(String product, int quantity, int price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }
    
    
    
    public String getProduct() {
        return this.product;
    }
    public int getPrice() {
        return this.price;
    }
    
    
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public int price() {
        int total = this.quantity * this.price;
        return total;
    }
    
    public void increaseQuantity() {
        this.quantity = this.quantity + 1;
    }
    
    @Override
    public String toString() {
        return this.product + ": " + this.quantity;
    }
    
    
}
