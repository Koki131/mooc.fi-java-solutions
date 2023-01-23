/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author milapetrov
 */
public class Pipe<T> {
    private List<T> list;
    private T object;
    
    public Pipe() {
        this.list = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.list.add(value);
    }
    
    public void setValue(T value) {
        this.object = value;
    }
    
    public T takeFromPipe() {
        
        if (list.isEmpty()) {
            return null;
            
        } else {
            setValue(list.get(0));
            list.remove(list.get(0));
        }
        return object;
    }
    
    public boolean isInPipe() {
        if (list.isEmpty()) {
            return false;
        }
        return true;
    }
}
