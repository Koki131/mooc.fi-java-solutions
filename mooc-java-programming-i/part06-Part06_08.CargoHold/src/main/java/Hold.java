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

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> hold;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.hold = new ArrayList<>();
    }
    
    
    
    public void addSuitcase(Suitcase suitcase) {
        this.hold.add(suitcase);
        int total = 0;
        for (Suitcase suit : this.hold) {
            total = total + suit.totalWeight();
        }
        if (total > this.maxWeight) {
            this.hold.remove(this.hold.get(this.hold.size()-1));
        }
    }
    
    public void printItems() {
        for (Suitcase suitcase : this.hold) {
            suitcase.printItems();
        }
    }
    @Override
    public String toString() {
        int weight = 0;
        for (Suitcase suitcase : this.hold) {
            weight = weight + suitcase.totalWeight();
        }
        return "" + this.hold.size() + " suitcases (" + weight + " kg)";
    }
    
    
}
