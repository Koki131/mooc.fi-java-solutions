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

public class Abbreviations {
    HashMap<String, String> abrv;
    
    public Abbreviations() {
        this.abrv = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        abrv.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        if (this.abrv.containsKey(abbreviation)) {
            return true;
        } else {
            return false;
        }
    }
    
    public String findExplanationFor(String abbreviation) {
        if (this.abrv.containsKey(abbreviation)) {
            return this.abrv.get(abbreviation);
        } else {
            return null;
        }
    }
    
    
}
