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

public class IOU {
    private HashMap<String, Double> hashmap;
    
    public IOU() {
        this.hashmap = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        hashmap.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
       return this.hashmap.getOrDefault(toWhom, 0.0);
    }
    
    public double howMuchDoIOweTo_2(String toWhom) {
        if (this.hashmap.containsKey(toWhom)) {
            return this.hashmap.get(toWhom);
        }
        return 0;
    }
}
