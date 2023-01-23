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
public class Hideout<T> {
    private T object;
    private List<T> list;
    
    public Hideout() {
        this.list = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide) {
        setValue(toHide);
        this.list.add(toHide);       
    }
    
    public void setValue(T item) {
        this.object = item;
    }
    
    public T takeFromHideout() {
         list.remove(object);
         return object;
    }
    
    public boolean isInHideout() {
        if (!(list.contains(object))) {
            return false;
        }
        return true;
    }
}
