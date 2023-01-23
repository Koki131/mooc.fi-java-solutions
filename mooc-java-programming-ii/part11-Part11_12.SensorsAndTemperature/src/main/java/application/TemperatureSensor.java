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
public class TemperatureSensor implements Sensor {
    private boolean sensor;

   
    public TemperatureSensor() {
        this.sensor = false;       
    }
        
    @Override
    public boolean isOn() {
        return sensor;
    }
    
    @Override
    public void setOn() {
        this.sensor = true;
    }
    
    @Override
    public void setOff() {
        this.sensor = false;
    }
    
    @Override
    public int read() {
        if (isOn() == false) {
            throw new IllegalStateException("The sensor must be on");
        } else {
            Random rand = new Random();
            int random =  rand.nextInt((30 + 30) + 1) - 30;
            return random;
        }       
    }    
}
