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

public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.balance = initialBalance;
        this.history = new ChangeHistory();
        this.history.add(balance);
        
    }
    
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);        
        this.history.add(balance);
       
        
       
    }
    
    public void print() {
        System.out.println(balance);
    }
    
    public double takeFromWarehouse(double amount) {   
        if (balance < amount) {
            return balance;
        }
        super.takeFromWarehouse(amount);
        this.history.add(balance);
        
        return amount;
        
        
        
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
        
    }
    
    public String history() {
        return history.toString();
    }
}
