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

public class Package {
    private ArrayList<Gift> store;
    
    public Package() {
        this.store = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        this.store.add(gift);
    }
    
    public int totalWeight() {
        int total = 0;
        for (Gift gift : this.store) {
            total = total + gift.getWeight();
        }
        return total;
    }
}
