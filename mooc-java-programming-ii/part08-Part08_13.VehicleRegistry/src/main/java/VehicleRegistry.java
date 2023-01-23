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

public class VehicleRegistry {
    private HashMap<LicensePlate, String> owners;
    
    public VehicleRegistry() {
        this.owners = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {                
        if (this.owners.get(licensePlate) == null) {
            this.owners.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        return owners.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (this.owners.containsKey(licensePlate)) {
            owners.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates() {
        for (LicensePlate license : this.owners.keySet()) {
            System.out.println(license);
        }
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String license : this.owners.values()) {
            if (!(owners.contains(license))) {
                owners.add(license);
            }
        }
        for (String owner : owners) {
            System.out.println(owner);
        }
    }
}
