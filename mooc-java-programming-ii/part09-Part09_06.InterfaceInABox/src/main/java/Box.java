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

public class Box implements Packable {
    private double maxWeight;
    private ArrayList<Packable> box;
    private double sum;
    
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.box = new ArrayList<>();
        this.sum = 0;
    }
    
    public double weight() {
        double weight = 0;
        for (Packable item : box) {
            weight = weight + item.weight();
        }
        return weight;
    }
    
    public void add(Packable item) {
        box.add(item);
        sum = sum + item.weight();
        if (sum > maxWeight) {
            box.remove(box.size() - 1);
            sum = sum - item.weight();
        }
        
    }
    
    @Override
    public String toString() {
        return "Box: " + box.size() + " items, total weight " + this.sum + " kg"; 
    }
}
