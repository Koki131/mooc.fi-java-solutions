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
import java.util.stream.*;

public class Reader implements Comparable<Reader> {
    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private int year;
    private double percent;
    
    public Reader(String theme, String group, String gender, String country, int year, double percent) {
        this.theme = theme;
        this.ageGroup = group;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.percent = percent;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public double getPercent() {
        return this.percent;
    }
    
    public String split() {
        String[] split = this.gender.split(" ");
        String one = split[0];
        return one;
    }
    
    @Override
    public int compareTo(Reader person) {
        if (this.percent == person.percent) {
            return 0;
        } else if (this.percent > person.percent) {
            return 1;
        } else {
            return -1;
        }
    }
    
    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + split() + ", " + this.percent;
    }
    
}
