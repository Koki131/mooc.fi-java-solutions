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

public class Recipes {
    private ArrayList<Reader> items;
    
    public Recipes() {
        this.items = new ArrayList<>();
    }
    
    public Reader getName() {
        return this.items.get(0);
    }
    
    public Reader getTime() {
        return this.items.get(1);
    }
    
    @Override
    public String toString() {
        return getName() + ": " + getTime();
    }
}
 

