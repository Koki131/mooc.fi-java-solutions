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
public class List<Type> {
    private Type[] values;
    private int firstFreeIndex;
    
    public List() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }
    
    public void add(Type value) {
        if (this.firstFreeIndex == this.values.length) {
            grow();
        }
        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++;       
    }
    
    private void grow() {
        int newSize = this.values.length + this.values.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];
        for (int n = 0; n < this.values.length; n++) {
            newValues[n] = this.values[n];
        } 
        this.values = newValues;
    }
    
    public boolean contains(Type value) {
        return indexOfValue(value) >= 0;
    }
    
    public void remove(Type value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return;            
        }        
        moveToLeft(indexOfValue);
        this.firstFreeIndex--;        
    }
    
    public int indexOfValue(Type value) {
        for (int n = 0; n < this.firstFreeIndex; n++) {
            if (this.values[n].equals(value)) {
                return n;
            }
        }
        return -1;
    }
    
    public void moveToLeft(int fromIndex) {
        for (int n = fromIndex; n < this.firstFreeIndex - 1; n++) {
            this.values[n] = this.values[n + 1];
        }
    }
    
    public Type value(int index) {
        if (index < 0 || index >= this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }
        return this.values[index];
    }
    
    public int size() {
        return this.firstFreeIndex;       
    }
    
    
    
}
