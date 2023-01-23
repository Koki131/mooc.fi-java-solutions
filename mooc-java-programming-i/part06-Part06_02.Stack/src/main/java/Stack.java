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
import java.util.Collections;

public class Stack {
    private ArrayList<String> s;
    
    public Stack() {
        this.s = new ArrayList<>();
    }
    
    
    public boolean isEmpty() {
        if (this.s.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public void add(String value) {
         this.s.add(0, value);
         
        
        
        
    }
    
    public ArrayList<String> values() {
        return this.s;
    }
    
    public String take() {
       String variable = "";
       variable = this.s.get(0);
       this.s.remove(variable);
       return variable;
    }
    
}
