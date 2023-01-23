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
public class HashMap<K, V> {
    private ArrayList<Pair<K, V>>[] values;
    private int firstFreeIndex;
    
    public HashMap() {
        this.values = new ArrayList[32];
        this.firstFreeIndex = 0;
    }
    
    
    public V getKey(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            return null;
        }
        
        ArrayList<Pair<K, V>> valuesAtIndex = this.values[hashValue];
        for (int n = 0; n < valuesAtIndex.size(); n++) {
            if (valuesAtIndex.get(n).getKey().equals(key)) {
                return valuesAtIndex.get(n).getValue();
            }
        }
        
        return null;
    }
    
    private ArrayList<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (values[hashValue] == null) {
            values[hashValue] = new ArrayList<>();
        }
        
        return values[hashValue];
    }
    
    private int getIndexOfKey(ArrayList<Pair<K, V>> myList, K key) {
        for (int n = 0; n < myList.size(); n++) {
            if (myList.get(n).getKey().equals(key)) {
                return n;
            }
        }
        return -1;
    }
    
    public void add(K key, V value) {
        ArrayList<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);
        
        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }
        
        if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
            grow();
        }        
    }
    
    private void grow() {
        ArrayList<Pair<K, V>>[] newArray = new ArrayList[this.values.length * 2];
        
        for (int n = 0; n < this.values.length; n++) {
            copy(newArray, n);
        }
        
        this.values = newArray;
    }
    
    private void copy(ArrayList<Pair<K, V>>[] newArray, int fromIdx) {
        for (int n = 0; n < this.values[fromIdx].size(); n++) {
            Pair<K, V> value = this.values[fromIdx].get(n);
            
            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
            
            if (newArray[hashValue] == null) {
                newArray[hashValue] = new ArrayList<>();
            }
            
            newArray[hashValue].add(value);
        }
    }
    
    public V remove(K key) {
        ArrayList<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        
        if (valuesAtIndex.isEmpty()) {
            return null;
        }
        
        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            return null;
        }
        
        Pair<K, V> pair = valuesAtIndex.get(index);
        valuesAtIndex.remove(pair);
        
        return pair.getValue();       
    }    
}
