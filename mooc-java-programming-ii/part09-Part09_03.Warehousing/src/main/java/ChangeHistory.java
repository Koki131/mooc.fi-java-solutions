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

public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    public void clear() {
        this.history.clear();
    }
    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double max = this.history.get(0);
        for (Double items : history) {
            if (max < items) {
                max = items;
            }
        }
        return max;
    }
    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double min = this.history.get(0);
        for (Double items : history) {
            if (min > items) {
                min = items;
            }
        }
        return min;
    }
    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double sum = 0;
        int count = 0;
        for (Double items : this.history) {
            sum = sum + items;
            count = count + 1;
        }
        double average = 1.0 * sum / count;
        return average;
    }
    
    @Override
    public String toString() {
        
        return ""+ this.history;
    }
}
