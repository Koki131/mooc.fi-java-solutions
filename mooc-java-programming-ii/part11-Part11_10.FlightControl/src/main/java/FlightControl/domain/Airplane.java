/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author milapetrov
 */
public class Airplane {
    private String ID;
    private int capacity;
    
    public Airplane(String id, int cap) {
        this.ID = id;
        this.capacity = cap;
    }
    
    public String getId() {
        return this.ID;
    }
    
    public int getCap() {
        return this.capacity;
    }
    
    @Override
    public String toString() {
        return this.ID + " (" + this.capacity + " capacity)";
    }
}
