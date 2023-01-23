/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author milapetrov
 */
public class Container {
    private int value;
    
    
    public Container() {
        this.value = 0;      
    }
    
    
    public int contains() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    
    
    public void add(int amount) {
        if (amount > 0) {
            this.value = this.value + amount;
        }
        if (this.value > 100) {
            this.value = 100;
        }
        
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            this.value = this.value - amount;
        }
        if (this.value < 0) {
            this.value = 0;
        }
    }
    
    @Override
    public String toString() {
        return this.value + "/100";
    }
}
