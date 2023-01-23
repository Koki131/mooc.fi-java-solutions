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

public class Container {
    private String name;
    private String nameInLatin;
    private int count;
   
    
    public Container(String name,String nameInLatin) {
        this.name = name;
        this.nameInLatin = nameInLatin;
        this.count = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    
    public String getNameInLatin() {
        return this.nameInLatin;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public void add() {
        this.count = this.count + 1;
    }
    
    public void setValue() {
        this.count = 0;
    }
    
    @Override
    public String toString() {
        if (getCount() == 1) {
            return this.name + " (" + this.nameInLatin + "): " + this.count + " observation.";
        }
        return this.name + " (" + this.nameInLatin + "): " + this.count + " observations.";
    }
    
}
