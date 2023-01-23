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

public class CD implements Packable {
    private String artist;
    private String nameOfCD;
    private int pubYear;
    private double weight;
    
    public CD(String artist, String nameOfCD, int year) {
        this.artist = artist;
        this.nameOfCD = nameOfCD;
        this.pubYear = year;
        this.weight = 0.1;
    }
    
    public double weight() {
        return this.weight;
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.nameOfCD + " (" + this.pubYear + ")";
    }
}
