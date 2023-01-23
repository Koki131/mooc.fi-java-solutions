/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.*;
/**
 *
 * @author milapetrov
 */
public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private List<Integer> readings;

    
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    @Override
    public boolean isOn() {
        boolean sens = true;
        for (Sensor sen : sensors) {
            if (sen.isOn() == false) {
                sens = sen.isOn();
            }
        }
        return sens;
    }
    
    @Override
    public void setOn() {
        for (Sensor sens : sensors) {
            sens.setOn();
        }
        
    }
    
    @Override
    public void setOff() {
        for (Sensor sens : sensors) {
            sens.setOff();
        }
    }
    
    @Override
    public int read() {
        if (isOn() == false || sensors.isEmpty()) {
            throw new IllegalStateException("Must be on and not empty");
        }
        int sum = 0;
        int count = 0;
        for (Sensor sens : sensors) {
            sum = sum + sens.read();
            count++;
        }
        
        int avg = sum / count;
        readings.add(avg);
        return avg;
        
    }
    
    public List<Integer> readings() {     
        return readings;
    }
    
    
}
