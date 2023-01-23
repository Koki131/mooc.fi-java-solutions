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

public class Herd implements Movable {
    private List<Movable> herd;

    
    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    @Override
    public String toString() { 
        String ani = "";
        for (Movable animal : herd) {
            ani += animal + "\n";
        }
        return ani;
    
    }
    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
         for (Movable animal : herd) {
             animal.move(dx, dy);
         }
    }
}
